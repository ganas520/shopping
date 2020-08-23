package com.flight.china.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.flight.china.bean.TbOrder;

public class DataForCoupangToJson {

	/**
	 * json数据解析
	 * @throws ParseException 
	 * 
	 * */
	public static List<TbOrder> setDataForCoupang(String orderStatus,String data) throws ParseException{
		List<TbOrder> ordersList = new ArrayList<>();
		
		//JSONObject{}   JSONArray[]
		//结果清单	如果没有结果，则返回一个空列表
		JSONArray dataJson = new JSONArray(data);
		for(int index = 0;index<dataJson.length();index++){
			TbOrder  tbOrder = new TbOrder();
			//订单来源
			tbOrder.setOrderSource("coupang");
			//订单状态
			tbOrder.setSystemOrderStatus(orderStatus);
			//所属国家
			tbOrder.setCountry("韩国");
			JSONObject dataObject = new JSONObject(dataJson.get(index).toString());
			//交货编号（捆绑交货编号）
//			int shipmentBoxId = dataObject.getInt("shipmentBoxId");
			//订单号
			int orderId = dataObject.getInt("orderId");
			tbOrder.setSourceOrderCode(String.valueOf(dataObject.getBigDecimal("orderId")));
			//订购日期	yyyy-MM-dd'T'HH：mm：ss
			String orderedAt = dataObject.getString("orderedAt");
			String[] orderedAts = orderedAt.split("T");
			String time = orderedAts[0]+" "+orderedAts[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date nowDate_Date = sdf.parse(time);
			tbOrder.setCreateTime(nowDate_Date);
			//订购者
			JSONObject orderer = dataObject.getJSONObject("orderer");
			//订货人姓名
			String name = orderer.getString("name");
			tbOrder.setBuyerName(name);
			//订购者电子邮件	蒙面的
//			String email = orderer.getString("email");
			//收件人的联系信息（安全号码）
			String safeNumber = orderer.getString("safeNumber");
			tbOrder.setBuyerPhone(safeNumber);
			//订购者的联系信息（真实电话号码）空值
//			String ordererNumber = orderer.getString("ordererNumber");
			//支付日期	yyyy-MM-dd'T'HH：mm：ss
//			String paidAt = dataObject.getString("paidAt");
			//订单状态
//			String status = dataObject.getString("status");
			//运费价格 运输费用
//			Float shippingPrice = dataObject.getFloat("shippingPrice");
			//远程价格  岛屿之间的运送费用
//			Float remotePrice = dataObject.getFloat("remotePrice");
			//	偏远地区  岛山
//			Boolean remoteArea = dataObject.getBoolean("remoteArea");
			//传递讯息	可选的
			String parcelPrintMessage = dataObject.getString("parcelPrintMessage");
			tbOrder.setOrderGoodsRemarks(parcelPrintMessage);
			//分开运送
			Boolean splitShipping = dataObject.getBoolean("splitShipping");
			//单独的交付可用性
			Boolean ableSplitShipping = dataObject.getBoolean("ableSplitShipping");
			//接收者
			JSONObject receiver = dataObject.getJSONObject("receiver");
			//收款人姓名
			String receiverName = receiver.getString("name");
			tbOrder.setConsigneeName(receiverName);
			//收件人的联系信息（安全号码）
			String receiverSafeNumber = receiver.getString("safeNumber");
			tbOrder.setFixedPhone(receiverSafeNumber);
			//收款人联系信息（真实电话号码） 空值
//			String receiverReceiverNumber = receiver.getString("receiverNumber");
			//收件人运送至1
			String receiverAddr1 = receiver.getString("addr1");
			//收款人运费2
			String receiverAddr2 = receiver.getString("addr2");
			if(!"".equals(receiverAddr1) && !"".equals(receiverAddr2)) {
				tbOrder.setBuyerAddress(receiverAddr1+"+"+receiverAddr2);
			}else if(!"".equals(receiverAddr1) && "".equals(receiverAddr2)) {
				tbOrder.setBuyerAddress(receiverAddr1);
			}else if("".equals(receiverAddr1) && !"".equals(receiverAddr2)) {
				tbOrder.setBuyerAddress(receiverAddr2);
			}
			//收件人邮政编码
			String receiverPostCode = receiver.getString("postCode");
			
			
			//海外配送信息
			JSONObject overseaShippingInfoDto = dataObject.getJSONObject("overseaShippingInfoDto");
			//海外配送信息-个性化订购
			Object overseaShippingInfoDtoPersonalCustomsClearanceCode = overseaShippingInfoDto.get("personalCustomsClearanceCode");
			tbOrder.setInternatinnalLogisticsNumber(overseaShippingInfoDtoPersonalCustomsClearanceCode == null ?"":String.valueOf(overseaShippingInfoDtoPersonalCustomsClearanceCode));
			//海外配送信息-订购人
//			String overseaShippingInfoDtoOrderersSsn = overseaShippingInfoDto.getString("orderersSsn");
			//海外配送信息-订单电话
//			String overseaShippingInfoDtoOrdererPhoneNumber = overseaShippingInfoDto.getString("ordererPhoneNumber");
			//信使	CJ韩国快递，韩进快递
//			String deliveryCompanyName = dataObject.getString("deliveryCompanyName");
			//运单号
//			String invoiceNumber = dataObject.getString("invoiceNumber");
			//交货日期（发货日期）yyyy-MM-dd HH：mm：ss
//			String inTrasitDateTime = dataObject.getString("inTrasitDateTime");
			//交货完成日期	yyyy-MM-dd HH：mm：ss
//			String deliveredDate = dataObject.getString("deliveredDate");
			//付款地点
//			String refer = dataObject.getString("refer");
			
			
			//交付物品
			JSONArray orderItems = dataObject.getJSONArray("orderItems");
			for(int i = 0; i < orderItems.length(); i ++){
				//交付物品
				JSONObject orderItemsObject = new JSONObject(orderItems.get(i).toString());
				//未使用/如果没有则返回0
//				int orderItemsVendorltemPackagedId = orderItemsObject.getInt("vendorltemPackagedId");
				//没用过
//				String orderItemsVendorltemPackagedName = orderItemsObject.getString("vendorltemPackagedName");
				//可选/如果没有则返回0
//				int orderItemsProductId = orderItemsObject.getInt("productId");
				//供应商 id
//				int orderItemsVendorltemId = orderItemsObject.getInt("vendorItemId");
				//供应商 姓名
//				String orderItemsVendorltemName = orderItemsObject.getString("vendorItemName");
				//shippingCount =商品的采购订单数量为	holdCountForCancel =取消将退还数量cancelCount =取消已确认的数量订单数量= shippingCount-（holdCountForCancel + cancelCount）
//				int orderItemsShippingCount = orderItemsObject.getInt("shippingCount");
				tbOrder.setShippedCount(String.valueOf(orderItemsObject.getBigDecimal("shippingCount")));

				//一件商品的价格
				Float orderItemsSalesPrice = orderItemsObject.getFloat("salesPrice");
				tbOrder.setGoodsAmount(String.valueOf(orderItemsSalesPrice));

				//付款价格：salesPrice * shippingCount
//				Float orderItemsOrderPrice = orderItemsObject.getFloat("orderPrice");
				//总折扣价格，DiscountPrice（即时折扣金额）= InstantCouponDiscount（即时折扣优惠券）+	可下载的Coupon（下载优惠券）+	DiscountcoupangDiscount（折扣优惠券支持）
//				Float orderItemsDiscountPrice = orderItemsObject.getFloat("discountPrice");
				//即时折扣券
//				int orderItemsInstanttCouponDisCount = orderItemsObject.getInt("instantCouponDiscount");
				//下载优惠券
//				int orderItemsDownloadableCouponDiscount = orderItemsObject.getInt("downloadableCouponDiscount");
				//折扣券支持
//				int orderItemsCoupangDiscount = orderItemsObject.getInt("coupangDiscount");
				//外部代码
//				String orderItemsExternalVendorSkuCode = orderItemsObject.getString("externalVendorSkuCode");
				//每个产品的单个项目
//				String orderItemsEtcInfoHeader = orderItemsObject.getString("etcInfoHeader");
				//用户按产品输入的单个输入项的输入值	可选的	该字段存在，但没有值
//				String orderItemsEtcInfoValue = orderItemsObject.getString("etcInfoValue");
				//按产品列出的单个输入项的用户输入值列表
//				JSONArray orderItemsEtcInfoValues = orderItemsObject.getJSONArray("etcInfoValues");
				//公司产品编号
				int orderItemsSellerProductId = orderItemsObject.getInt("sellerProductId");
				tbOrder.setSourceGoodsCode(String.valueOf(orderItemsObject.getBigDecimal("sellerProductId")));

				//公司名
//				String orderItemsSellerProductName = orderItemsObject.getString("sellerProductName");
				//注册选项名称
//				String orderItemsSellerProductItemName = orderItemsObject.getString("sellerProductItemName");
				//首次注册选项名称
//				String orderItemsFirstSellerProductItemName = orderItemsObject.getString("firstSellerProductItemName");
				//取消数量
//				int orderItemsCancelCount = orderItemsObject.getInt("cancelCount");
				//等待退款
//				int orderItemsHoldCountForCancel = orderItemsObject.getInt("holdCountForCancel");
				//订购时的预定交货日期（预计交货日期）可选/ yyyy-mm-dd
//				String orderItemsEstimatedShippingDate = orderItemsObject.getString("estimatedShippingDate");
				//实际交货日期（单独交货）可选/ yyyy-mm-dd
//				String orderItemsPlannedShippingDate = orderItemsObject.getString("plannedShippingDate");
				//运单号上传日期	可选/ yyyy-MM-dd'T'HH：mm：ss
//				String orderItemsInvoiceNumberUploadDate = orderItemsObject.getString("invoiceNumberUploadDate");
				//公司产品选项附加信息
//				JSONObject orderItemsExtraProperties = orderItemsObject.getJSONObject("extraProperties");
				//价格最低	真假
//				Boolean orderItemsPricingBadge = orderItemsObject.getBoolean("pricingBadge");
				//二手产品	真假
//				Boolean orderItemsUsedProduct = orderItemsObject.getBoolean("usedProduct");
				//购买确认日期	yyyy-MM-dd HH：mm：ss
//				String orderItemsConfirmDate = orderItemsObject.getString("confirmDate");
				//交货成本分类	付费，免费
//				String orderItemsDeliveryChargeTypeName = orderItemsObject.getString("deliveryChargeTypeName");
				//取消订单
//				Boolean orderItemsCanceled = orderItemsObject.getBoolean("canceled");
				ordersList.add(tbOrder);
			}
			
			
		}
		return ordersList;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
