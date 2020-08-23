package com.flight.china.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.china.bean.TbGoods;
import com.flight.china.bean.TbOrder;
import com.flight.china.service.TbOrdersService;
import com.flight.china.util.DataForCoupangToJson;
import com.flight.china.util.HmacReturn;
import com.flight.china.util.HmacReturnbyday;
import com.flight.china.util.HttpGet11GetXml;
import com.flight.china.util.Httpget11;
import com.flight.china.util.SKUUtil;

@ResponseBody
@RestController
public class OrdersAction {

	@Autowired
	public TbOrdersService tbOrdersService;
	
	@RequestMapping(value = "/getAllOrders")
	public Map<String,Object> getAllOrders(@RequestBody(required=false) TbOrder tbOrders,HttpServletRequest req){
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		System.out.println(req.getParameter("status"));
		int startWith = (page-1)*rows;
		TbOrder tbOrder = new TbOrder();
		tbOrder.setStartWith(startWith);
		tbOrder.setRows(rows);
		tbOrder.setSystemOrderStatus(req.getParameter("status"));
		int count = tbOrdersService.getOrdersCount(tbOrder);
		List<TbOrder> tbGoodsList= tbOrdersService.getAllOrders(tbOrder);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", count);
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList);
		return map;
	}
	
	@RequestMapping(value = "/getAllOrdersLike")
	public Map<String,Object> getAllOrdersLike(HttpServletRequest req) throws ParseException{
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		int startWith = (page-1)*rows;
		TbOrder tbOrder = new TbOrder();
		tbOrder.setStartWith(startWith);
		tbOrder.setRows(rows);
		String orderCode = req.getParameter("orderCode");
		if(!"".equals(orderCode) && orderCode != null) {
			tbOrder.setOrderCode(orderCode);
		}
		String buyerName = req.getParameter("buyerName");
		if(!"".equals(buyerName) && buyerName != null) {
			tbOrder.setBuyerName(buyerName);
		}
		String supplierName = req.getParameter("supplierName");
		if(!"".equals(supplierName) && supplierName != null) {
			tbOrder.setSupplierName(supplierName);
		}
		String ordersStatus = req.getParameter("systemOrderStatus");
		if(!"".equals(ordersStatus) && ordersStatus != null) {
			tbOrder.setSystemOrderStatus(ordersStatus);
		}
		String createTime = req.getParameter("createTime");
		if(!"".equals(createTime) && createTime != null) {
			tbOrder.setCreateTime(simpleDateFormat.parse(createTime.trim()));
		}
		String updateTime = req.getParameter("updateTime");
		if(!"".equals(updateTime) && updateTime != null) {
			tbOrder.setUpdateTime(simpleDateFormat.parse(updateTime.trim()));
		}
		List<TbOrder> tbOrdersList= tbOrdersService.getOrdersLike(tbOrder);
		int count = tbOrdersService.getOrdersLikeCount(tbOrder);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", count);
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbOrdersList);
		return map;
	}
	
	
	@RequestMapping(value = "/insertOrders")
	public Map<String,Object> insertOrders(HttpServletRequest req) throws ParseException, URISyntaxException{
		
		String dataStr = "[\r\n" + 
				"    {\r\n" + 
				"      \"shipmentBoxId\": 448531493,\r\n" + 
				"      \"orderId\": 111,\r\n" + 
				"      \"orderedAt\": \"2017-10-10T10:20:16\",\r\n" + 
				"      \"orderer\": {\r\n" + 
				"        \"name\": \"신*희\",\r\n" + 
				"        \"email\": \"eu*****@na\",\r\n" + 
				"        \"safeNumber\": \"0503-**-5464\",\r\n" + 
				"        \"ordererNumber\": null\r\n" + 
				"      },\r\n" + 
				"      \"paidAt\": \"2017-10-10T10:20:16\",\r\n" + 
				"      \"status\": \"FINAL_DELIVERY\",\r\n" + 
				"      \"shippingPrice\": 2500,\r\n" + 
				"      \"remotePrice\": null,\r\n" + 
				"      \"remoteArea\": false,\r\n" + 
				"      \"parcelPrintMessage\": \"문 앞\",\r\n" + 
				"      \"splitShipping\": false,\r\n" + 
				"      \"ableSplitShipping\": false,\r\n" + 
				"      \"receiver\": {\r\n" + 
				"        \"name\": \"신*희\",\r\n" + 
				"        \"safeNumber\": \"0503-**-5464\",\r\n" + 
				"        \"receiverNumber\": null,\r\n" + 
				"        \"addr1\": \"경기 오산시 가수동 **아파트\",\r\n" + 
				"        \"addr2\": \"109동 *호\",\r\n" + 
				"        \"postCode\": \"447-700\"\r\n" + 
				"      },\r\n" + 
				"      \"orderItems\": [\r\n" + 
				"        {\r\n" + 
				"          \"vendorItemPackageId\": 0,\r\n" + 
				"          \"vendorItemPackageName\": \"인디고뱅크키즈 기모 테잎배색 트레이닝 팬츠 IKTM17WG1\",\r\n" + 
				"          \"productId\": 31846051,\r\n" + 
				"          \"vendorItemId\": 3242596358,\r\n" + 
				"          \"vendorItemName\": \"인디고뱅크키즈 기모 테잎배색 트레이닝 팬츠 IKTM17WG1, 07 DARK GREY, 160호\",\r\n" + 
				"          \"shippingCount\": 1,\r\n" + 
				"          \"salesPrice\": 19000,\r\n" + 
				"          \"orderPrice\": 19000,\r\n" + 
				"          \"discountPrice\": 3000,\r\n" + 
				"          \"instantCouponDiscount\": 2000,\r\n" + 
				"          \"downloadableCouponDiscount\": 1000,\r\n" + 
				"          \"coupangDiscount\": 0,\r\n" + 
				"          \"externalVendorSkuCode\": \"170816368810\",\r\n" + 
				"          \"etcInfoHeader\": null,\r\n" + 
				"          \"etcInfoValue\": null,\r\n" + 
				"          \"etcInfoValues\": [\r\n" + 
				"            \"추가메시지1\",\r\n" + 
				"            \"추가메시지2\"\r\n" + 
				"          ],\r\n" + 
				"          \"sellerProductId\": 666,\r\n" + 
				"          \"sellerProductName\": \"인디고뱅크키즈 A5 기모 배색츄키니 IKTM17WG1\",\r\n" + 
				"          \"sellerProductItemName\": \"07 DARK GREY 160호\",\r\n" + 
				"          \"firstSellerProductItemName\": \"07 DARK GREY/160호\",\r\n" + 
				"          \"cancelCount\": 0,\r\n" + 
				"          \"holdCountForCancel\": 0,\r\n" + 
				"          \"estimatedShippingDate\": \"2017-10-16\",\r\n" + 
				"          \"plannedShippingDate\": \"\",\r\n" + 
				"          \"invoiceNumberUploadDate\": \"\",\r\n" + 
				"          \"extraProperties\": {},\r\n" + 
				"          \"pricingBadge\": false,\r\n" + 
				"          \"usedProduct\": false,\r\n" + 
				"          \"confirmDate\": \"2017-10-25 00:10:33\",\r\n" + 
				"          \"deliveryChargeTypeName\": \"유료\",\r\n" + 
				"          \"canceled\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"overseaShippingInfoDto\": {\r\n" + 
				"        \"personalCustomsClearanceCode\": \"\",\r\n" + 
				"        \"ordererSsn\": \"\",\r\n" + 
				"        \"ordererPhoneNumber\": \"\"\r\n" + 
				"      },\r\n" + 
				"      \"deliveryCompanyName\": \"CJ 대한통운\",\r\n" + 
				"      \"invoiceNumber\": \"340010913442\",\r\n" + 
				"      \"inTrasitDateTime\": \"2017-10-16 22:08:04\",\r\n" + 
				"      \"deliveredDate\": \"2017-10-17 17:17:52\",\r\n" + 
				"      \"refer\": \"안드로이드앱\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"shipmentBoxId\": 448537989,\r\n" + 
				"      \"orderId\": 222,\r\n" + 
				"      \"orderedAt\": \"2017-10-10T10:35:04\",\r\n" + 
				"      \"orderer\": {\r\n" + 
				"        \"name\": \"김*숙\",\r\n" + 
				"        \"email\": \"hs*****@na\",\r\n" + 
				"        \"safeNumber\": \"0503-**-5013\",\r\n" + 
				"        \"ordererNumber\": null\r\n" + 
				"      },\r\n" + 
				"      \"paidAt\": \"2017-10-10T10:35:04\",\r\n" + 
				"      \"status\": \"FINAL_DELIVERY\",\r\n" + 
				"      \"shippingPrice\": 0,\r\n" + 
				"      \"remotePrice\": null,\r\n" + 
				"      \"remoteArea\": false,\r\n" + 
				"      \"parcelPrintMessage\": \"직접 받고 부재 시 문 앞\",\r\n" + 
				"      \"splitShipping\": false,\r\n" + 
				"      \"ableSplitShipping\": false,\r\n" + 
				"      \"receiver\": {\r\n" + 
				"        \"name\": \"김*숙\",\r\n" + 
				"        \"safeNumber\": \"0502-344-6681\",\r\n" + 
				"        \"receiverNumber\": null,\r\n" + 
				"        \"addr1\": \"경기 광명시 하안1동 두산트레지움아파트\",\r\n" + 
				"        \"addr2\": \"107동701호\",\r\n" + 
				"        \"postCode\": \"423-747\"\r\n" + 
				"      },\r\n" + 
				"      \"orderItems\": [\r\n" + 
				"        {\r\n" + 
				"          \"vendorItemPackageId\": 0,\r\n" + 
				"          \"vendorItemPackageName\": \"리틀브렌 후드달이 구스 경량 점퍼 LBJD17WG5\",\r\n" + 
				"          \"productId\": 34047877,\r\n" + 
				"          \"vendorItemId\": 3261300431,\r\n" + 
				"          \"vendorItemName\": \"리틀브렌 후드달이 구스 경량 점퍼 LBJD17WG5, 04 MIDDLE MELANGE GR, 170호\",\r\n" + 
				"          \"shippingCount\": 1,\r\n" + 
				"          \"salesPrice\": 27800,\r\n" + 
				"          \"orderPrice\": 27800,\r\n" + 
				"          \"discountPrice\": 2470,\r\n" + 
				"          \"instantCouponDiscount\": 560,\r\n" + 
				"          \"downloadableCouponDiscount\": 1910,\r\n" + 
				"          \"coupangDiscount\": 0,\r\n" + 
				"          \"externalVendorSkuCode\": \"170824416510\",\r\n" + 
				"          \"etcInfoHeader\": null,\r\n" + 
				"          \"etcInfoValue\": null,\r\n" + 
				"          \"etcInfoValues\": [\r\n" + 
				"            \"추가메시지1\",\r\n" + 
				"            \"추가메시지2\"\r\n" + 
				"          ],\r\n" + 
				"          \"sellerProductId\": 555,\r\n" + 
				"          \"sellerProductName\": \"리틀브렌 후드달이 구스 경량 점퍼 LBJD17WG5\",\r\n" + 
				"          \"sellerProductItemName\": \"04 MIDDLE MELANGE GR 170호\",\r\n" + 
				"          \"firstSellerProductItemName\": \"04 MIDDLE MELANGE GR/170호\",\r\n" + 
				"          \"cancelCount\": 0,\r\n" + 
				"          \"holdCountForCancel\": 0,\r\n" + 
				"          \"estimatedShippingDate\": \"2017-10-16\",\r\n" + 
				"          \"plannedShippingDate\": \"\",\r\n" + 
				"          \"invoiceNumberUploadDate\": \"\",\r\n" + 
				"          \"extraProperties\": {},\r\n" + 
				"          \"pricingBadge\": false,\r\n" + 
				"          \"usedProduct\": false,\r\n" + 
				"          \"confirmDate\": \"2017-10-25 02:10:27\",\r\n" + 
				"          \"deliveryChargeTypeName\": \"무료\",\r\n" + 
				"          \"canceled\": false\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"overseaShippingInfoDto\": {\r\n" + 
				"        \"personalCustomsClearanceCode\": \"\",\r\n" + 
				"        \"ordererSsn\": \"\",\r\n" + 
				"        \"ordererPhoneNumber\": \"\"\r\n" + 
				"      },\r\n" + 
				"      \"deliveryCompanyName\": \"CJ 대한통운\",\r\n" + 
				"      \"invoiceNumber\": \"340010912565\",\r\n" + 
				"      \"inTrasitDateTime\": \"2017-10-16 22:08:04\",\r\n" + 
				"      \"deliveredDate\": \"2017-10-17 20:42:23\",\r\n" + 
				"      \"refer\": \"안드로이드앱\"\r\n" + 
				"    }\r\n" + 
				"  ]";
		
		
		
		String shopName = req.getParameter("shopName");
		String yearMonth = req.getParameter("yearMonth");
		if("11街".equals(shopName)){
			List<String> sd = Httpget11.getYearMonth(yearMonth);
			for(int i = 0; i < sd.size(); i+=2) {
				//付款阶段
				URI uri = new URIBuilder("https://api.11st.co.kr/rest/ordservices/standby/"+sd.get(i)+"/"+sd.get(i+1)).build();
				//
				String result = Httpget11.get(uri.toString());
				List<TbOrder> get11list = HttpGet11GetXml.get11Message(result,"付款阶段");
				if(get11list.size() > 0) {
					setMessage(get11list,"付款阶段");
				}
				//产品准备
				//https://api.11st.co.kr/rest/ordservices/delvplacestandby/[startTime]/[endTime]
				URI uriReady = new URIBuilder("https://api.11st.co.kr/rest/ordservices/delvplacestandby/"+sd.get(i)+"/"+sd.get(i+1)).build();
				String resultReady = Httpget11.get(uriReady.toString());
				List<TbOrder> get11listReady = HttpGet11GetXml.get11Message(resultReady,"产品准备");
				if(get11listReady.size() > 0) {
					setMessage(get11listReady,"产品准备");
				}
				//交付订单https://api.11st.co.kr/rest/ordservices/complete/[startTime]/[endTime]
				URI uriDeliver = new URIBuilder("https://api.11st.co.kr/rest/ordservices/complete/"+sd.get(i)+"/"+sd.get(i+1)).build();
				String resultDeliver = Httpget11.get(uriDeliver.toString());
				List<TbOrder> get11listDeliver = HttpGet11GetXml.get11Message(resultDeliver,"交付订单");
				if(get11listDeliver.size() > 0) {
					setMessage(get11listDeliver,"交付订单");
				}
				//运输订单https://api.11st.co.kr/rest/ordservices/packaging/[startTime]/[endTime]
				URI uriTransport = new URIBuilder("https://api.11st.co.kr/rest/ordservices/packaging/"+sd.get(i)+"/"+sd.get(i+1)).build();
				String resultTransport = Httpget11.get(uriTransport.toString());
				List<TbOrder> get11listTransport = HttpGet11GetXml.get11Message(resultTransport,"运输订单");
				if(get11listTransport.size() > 0) {
					setMessage(get11listTransport,"运输订单");
				}
				//交货完成https://api.11st.co.kr/rest/ordservices/dlvcompleted/[startTime]/[endTime]
				URI uriDone = new URIBuilder("https://api.11st.co.kr/rest/ordservices/dlvcompleted/"+sd.get(i)+"/"+sd.get(i+1)).build();
				String resultDone = Httpget11.get(uriDone.toString());
				List<TbOrder> get11listDone = HttpGet11GetXml.get11Message(resultDone,"交货完成");
				if(get11listDone.size() > 0) {
					setMessage(get11listDone,"交货完成");
				}
				//订单取消http://api.11st.co.kr/rest/claimservice/cancelorders/[startTime]/[endTime]
				URI uriCancel = new URIBuilder("https://api.11st.co.kr/rest/ordservices/dlvcompleted/"+sd.get(i)+"/"+sd.get(i+1)).build();
				String resultCancel = Httpget11.get(uriCancel.toString());
				List<TbOrder> get11listCancel = HttpGet11GetXml.get11Message(resultCancel,"订单取消");
				if(get11listCancel.size() > 0) {
					setMessage(get11listCancel,"订单取消");
				}
			}
		}
		/*
		 * ACCEPT:付款完成   INSTRUCT:产品准备   DEPARTURE:交付订单   DELIVERING:运输   FINAL_DELIVERY:交货完成   NONE_TRACKING:直接交付（不适用于交付链接）
		 * */
		
		
		//coupang平台数据
		if("coupang".equals(shopName)) {
			String[] statuss = {"ACCEPT","INSTRUCT","DEPARTURE","DELIVERING","FINAL_DELIVERY","NONE_TRACKING"};
			String[] statusC = {"付款阶段","产品准备","交付订单","运输订单","交货完成","直接交付"};
			for(int i = 0; i<statuss.length; i++) {
				String data = HmacReturnbyday.test(statuss[i],yearMonth);
				System.out.println("data:"+data);
				JSONObject dataJson = new JSONObject(data);
				if("[]".equals(dataJson.getJSONArray("data").toString())){
					continue;
				}
				List<TbOrder> orderList = DataForCoupangToJson.setDataForCoupang(statuss[i],dataJson.getJSONArray("data").toString());
//			List<TbOrder> orderList = DataForCoupangToJson.setDataForCoupang(statuss[i],dataStr);
				setMessage(orderList,statusC[i]);
			}
			String dataCancel = HmacReturn.test();
			JSONObject dataJsonCanCel = new JSONObject(dataCancel);
			if(!"[]".equals(dataJsonCanCel.getJSONArray("data").toString())){
				List<TbOrder> orderList = DataForCoupangToJson.setDataForCoupang("CanCel",dataJsonCanCel.getJSONArray("data").toString());
				setMessage(orderList,"订单取消");
			}
		}
		
		//订单请求连接
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		return map;
	}
	
	private void setMessage(List<TbOrder> orderList,String status) {
		for(TbOrder tbOrder:orderList) {
			TbOrder tb = new TbOrder();
			tb.setSourceOrderCode(tbOrder.getSourceOrderCode());
			tb.setSourceGoodsCode(tbOrder.getSourceGoodsCode());
			//获取订单信息，若存在，则修改，并赋值id，和状态编码转换
			List<TbOrder> orderMessage = tbOrdersService.getOrderMessage(tb);
			tbOrder.setSystemOrderStatus(status);
			if(orderMessage.size()>0) {
				System.out.println(111);
				tbOrder.setId(orderMessage.get(0).getId());
				tbOrdersService.updateOrder(tbOrder);
			}else {
				System.out.println(222);
				String sku = SKUUtil.getSku();
				tbOrder.setOrderCode(sku);
				String sku1 = SKUUtil.getSku();
				tbOrder.setDomesticLogisticsNumber(sku1);
				tbOrder.setSystemOrderStatus(status);
				tbOrdersService.insertOrders(tbOrder);
			}
		}
	}
	
	@RequestMapping(value = "/updateOrders")
	public Map<String,Object> updateOrders(@RequestBody(required=false) TbOrder tbOrder,HttpServletRequest req){
		
		tbOrdersService.updateOrder(tbOrder);
		//订单请求连接
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		return map;
	}
	
	@RequestMapping(value = "/deleteOrders")
	public Map<String,Object> deleteOrders(@RequestBody(required=false) TbOrder tbOrder,HttpServletRequest req){
		
		tbOrdersService.deleteOrder(tbOrder);
		//订单请求连接
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		return map;
	}
	
	@RequestMapping(value = "/getOrderMessage")
	public Map<String,Object> getOrderMessage(@RequestBody(required=false) TbOrder tbOrder,HttpServletRequest req){
		List<TbOrder> tbGoodsList= tbOrdersService.getOrderMessage(tbOrder);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", tbGoodsList.size());
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList.get(0));
		return map;
	}
	
	@RequestMapping(value = "/getOrderMessageLike")
	public Map<String,Object> getOrderMessageLike(@RequestBody(required=false) TbOrder tbOrders,HttpServletRequest req){
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		int startWith = (page-1)*rows;
		int count = tbOrdersService.getOrdersCount(tbOrders);
		tbOrders.setStartWith(startWith);
		tbOrders.setRows(rows);
		List<TbOrder> tbGoodsList= tbOrdersService.getAllOrders(tbOrders);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", count);
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList);
		return map;
	}
}
