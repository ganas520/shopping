package com.flight.china.util;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import com.flight.china.bean.TbOrder;

public class HttpGet11GetXml {

	public static List<TbOrder> get11Message(String xml,String orderStatus) throws ParseException {
		List<TbOrder> orderList = new ArrayList<TbOrder>();
		String xmls = "<?xml version=\"1.0\" encoding=\"euc-kr\" standalone=\"yes\"?>\r\n" + 
				"<ns2:orders xmlns:ns2=\"http://skt.tmall.business.openapi.spring.service.client.domain/\">\r\n" + 
				"  <ns2:order>\r\n" + 
				"    <addPrdNo>0</addPrdNo>\r\n" + 
				"    <addPrdYn>N</addPrdYn>\r\n" + 
				"    <bndlDlvSeq>4506571</bndlDlvSeq>\r\n" + 
				"    <bndlDlvYN>Y</bndlDlvYN>\r\n" + 
				"    <custGrdNm/>\r\n" + 
				"    <dlvCst>0</dlvCst>\r\n" + 
				"    <dlvCstType>03</dlvCstType>\r\n" + 
				"    <bmDlvCst>4500</bmDlvCst>\r\n" + 
				"    <bmDlvCstType>04</bmDlvCstType>\r\n" + 
				"    <dlvNo>40860365</dlvNo>\r\n" + 
				"    <gblDlvYn>N</gblDlvYn>\r\n" + 
				"    <giftCd/>\r\n" + 
				"    <memID>test11st</memID>\r\n" + 
				"    <memNo>1111111</memNo>\r\n" + 
				"    <ordAmt>19000</ordAmt>\r\n" + 
				"    <ordBaseAddr>123 New York ave</ordBaseAddr>\r\n" + 
				"    <ordDlvReqCont>null</ordDlvReqCont>\r\n" + 
				"    <ordDt>2010-01-10 04:07:11</ordDt>\r\n" + 
				"    <ordDtlsAddr>Apt 8809</ordDtlsAddr>\r\n" + 
				"    <ordMailNo>360100</ordMailNo>\r\n" + 
				"    <ordNm>John Doe</ordNm>\r\n" + 
				"    <ordNo>201001108318120</ordNo>\r\n" + 
				"    <ordOptWonStl>0</ordOptWonStl>\r\n" + 
				"    <ordPayAmt>16310</ordPayAmt>\r\n" + 
				"    <ordPrdSeq>1</ordPrdSeq>\r\n" + 
				"    <ordPrtblTel>010-9999-9999</ordPrtblTel>\r\n" + 
				"    <ordQty>1</ordQty>\r\n" + 
				"    <ordStlEndDt>2010-01-12 16:20:59</ordStlEndDt>\r\n" + 
				"    <ordTlphnNo>070-9999-9999</ordTlphnNo>\r\n" + 
				"    <prdNm>Shering v-neck knit t-shirt</prdNm>\r\n" + 
				"    <prdNo>29370295</prdNo>\r\n" + 
				"    <prdStckNo>999999999</prdStckNo>\r\n" + 
				"    <rcvrBaseAddr>123 New York ave</rcvrBaseAddr>\r\n" + 
				"    <rcvrDtlsAddr>Apt 8809</rcvrDtlsAddr>\r\n" + 
				"    <rcvrMailNo>360100</rcvrMailNo>\r\n" + 
				"    <rcvrMailNoSeq>011</rcvrMailNoSeq>\r\n" + 
				"    <rcvrNm>John Doe</rcvrNm>\r\n" + 
				"    <rcvrPrtblNo>010-9999-9999</rcvrPrtblNo>\r\n" + 
				"    <rcvrTlphn>070-9999-9999</rcvrTlphn>\r\n" + 
				"    <selPrc>19000</selPrc>\r\n" + 
				"    <sellerDscPrc>2280</sellerDscPrc>\r\n" + 
				"    <sellerPrdCd>000000000133275</sellerPrdCd>\r\n" + 
				"    <slctPrdOptNm>Size/Color:Size - S(66)/Color - Ivory [0000346774]-1</slctPrdOptNm>\r\n" + 
				"    <tmallDscPrc>410</tmallDscPrc>\r\n" + 
				"    <typeAdd>01</typeAdd>\r\n" + 
				"    <typeBilNo/>\r\n" + 
				"    <lstTmallDscPrc>0</lstTmallDscPrc>\r\n" + 
				"    <lstSellerDscPrc>0</lstSellerDscPrc>\r\n" + 
				"  </ns2:order>\r\n" + 
				"</ns2:orders>";
		
		String n = "<?xml version=\"1.0\" encoding=\"euc-kr\" standalone=\"yes\"?>\r\n" + 
				"<ns2:orders xmlns:ns2=\"http://skt.tmall.business.openapi.spring.service.client.domain/\">\r\n" + 
				"  <ns2:result_code>0</ns2:result_code>\r\n" + 
				"  <ns2:result_text>조회된 결과가 없습니다.</ns2:result_text>\r\n" + 
				"</ns2:orders>";
		
		// 开始解析
		long start = System.currentTimeMillis();

		SAXReader reader = new SAXReader();
		try {
			org.dom4j.Document doc = reader.read(new ByteArrayInputStream(xml.getBytes("euc-kr")));
			XPath paths = doc.createXPath("//ns2:orders");
			paths.selectSingleNode(doc);
			List<Element> lists = paths.selectNodes(doc);
			for(Element elements:lists) {
				System.out.println(elements.elementText("result_code"));
				if(elements.elementText("result_code") == null) {
					XPath path = doc.createXPath("//ns2:order");
					path.selectSingleNode(doc);
					List<Element> list = path.selectNodes(doc);
					for(Element element:list) {
						TbOrder tbOrder = new TbOrder();
						tbOrder.setOrderSource("11街");
						//订单状态
						tbOrder.setSystemOrderStatus(orderStatus);
						//所属国家
						tbOrder.setCountry("韩国");
						//附加项目的原始产品编号 0 ：不是其他项目→ 如果不是0 ：附加项目的原始产品编号
//						System.out.println("addPrdNo:[" + element.elementText("addPrdNo") + "]");
						//其他项目（是/否）→ Y ：其他项目（Y）→ N ：无其他项目（N）
//						System.out.println("addPrdYn:[" + element.elementText("addPrdYn") + "]");
						//组合运输序列号
//						System.out.println("bndlDlvSeq:[" + element.elementText("bndlDlvSeq") + "]");
						//联合运输（是/否）→ Y ：联合运输→ N ：单独运送
//						System.out.println("bndlDlvYN:[" + element.elementText("bndlDlvYN") + "]");
						//运输费用
//						System.out.println("dlvCst:[" + element.elementText("dlvCst") + "]");
						//运费支付方式→ 01 ：预付款→ 02 ：收到后付款→ 03 ：免费
//						System.out.println("dlvCstType:[" + element.elementText("dlvCstType") + "]");
						//交货编号
//						System.out.println("dlvNo:[" + element.elementText("dlvNo") + "]");
						//会员ID
//						System.out.println("memID:[" + element.elementText("memID") + "]");
						//会员编号
//						System.out.println("memNo:[" + element.elementText("memNo") + "]");
						//订单金额单价*数量（定单-取消-退货）+期权价格
//						System.out.println("ordAmt:[" + element.elementText("ordAmt") + "]");
						//第11个客户的地址
						System.out.println("ordBaseAddr:[" + element.elementText("ordBaseAddr") + "]");
						tbOrder.setBuyerAddress(element.elementText("ordBaseAddr")+"~"+element.elementText("ordDtlsAddr"));
						//运输说明
//						System.out.println("ordDlvReqCont:[" + element.elementText("ordDlvReqCont") + "]");
						//订购日期
						System.out.println("ordDt:[" + element.elementText("ordDt") + "]");
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						Date nowDate_Date = sdf.parse(element.elementText("ordDt"));
						tbOrder.setCreateTime(nowDate_Date);
						//11st客户的详细地址
//						System.out.println("ordDtlsAddr:[" + element.elementText("ordDtlsAddr") + "]");
						//第11位客户的邮件号码
//						System.out.println("ordMailNo:[" + element.elementText("ordMailNo") + "]");
						//第11位顾客的名字
						System.out.println("ordNm:[" + element.elementText("ordNm") + "]");
						tbOrder.setBuyerName(element.elementText("ordNm"));
						//11ST订单号
//						System.out.println("ordNo:[" + element.elementText("ordNo") + "]");
						//产品期权付款金额
//						System.out.println("ordOptWonStl:[" + element.elementText("ordOptWonStl") + "]");
						//总付款 订单金额+运费-卖方折扣价-mo优惠券
						System.out.println("ordPayAmt:[" + element.elementText("ordPayAmt") + "]");
						tbOrder.setGoodsAmount(element.elementText("ordPayAmt"));
						//订单号
						System.out.println("ordPrdSeq:[" + element.elementText("ordPrdSeq") + "]");
						tbOrder.setSourceOrderCode(element.elementText("ordPrdSeq"));
						//订单状态码
//						System.out.println("ordPrdStat:[" + element.elementText("ordPrdStat") + "]");
						//第11个客户手机号码
//						System.out.println("ordPrtblTel:[" + element.elementText("ordPrtblTel") + "]");
						//数量
						System.out.println("ordQty:[" + element.elementText("ordQty") + "]");
						tbOrder.setShippedCount(element.elementText("ordQty"));
						//客户电话号码
						System.out.println("ordTlphnNo:[" + element.elementText("ordTlphnNo") + "]");
						tbOrder.setBuyerPhone(element.elementText("ordTlphnNo"));
						//产品名称
//						System.out.println("prdNm:[" + element.elementText("prdNm") + "]");
						//11ST产品编号
						System.out.println("prdNo:[" + element.elementText("prdNo") + "]");
						tbOrder.setSourceGoodsCode(element.elementText("prdNo"));
						//订购产品选件代码
//						System.out.println("prdStckNo:[" + element.elementText("prdStckNo") + "]");
						//送货地址
//						System.out.println("rcvrBaseAddr:[" + element.elementText("rcvrBaseAddr") + "]");
						//送货详细地址
//						System.out.println("rcvrDtlsAddr:[" + element.elementText("rcvrDtlsAddr") + "]");
						//收件者邮件号码
//						System.out.println("rcvrMailNo:[" + element.elementText("rcvrMailNo") + "]");
						//收件人邮件编号顺序
//						System.out.println("rcvrMailNoSeq:[" + element.elementText("rcvrMailNoSeq") + "]");
						//收件者姓名
						System.out.println("rcvrNm:[" + element.elementText("rcvrNm") + "]");
						tbOrder.setConsigneeName(element.elementText("rcvrNm"));
						//接收器手机号码
						System.out.println("rcvrPrtblNo:[" + element.elementText("rcvrPrtblNo") + "]");
						tbOrder.setFixedPhone(element.elementText("rcvrPrtblNo")+"~"+ element.elementText("rcvrTlphn"));
						//接收方电话号码
//						System.out.println("rcvrTlphn:[" + element.elementText("rcvrTlphn") + "]");
						//价钱每件
//						System.out.println("selPrc:[" + element.elementText("selPrc") + "]");
						//卖方折扣价
//						System.out.println("sellerDscPrc:[" + element.elementText("sellerDscPrc") + "]");
						//卖方产品编号
//						System.out.println("sellerPrdCd:[" + element.elementText("sellerPrdCd") + "]");
						//产品选项名称
//						System.out.println("slctPrdOptNm:[" + element.elementText("slctPrdOptNm") + "]");
						//11ST优惠价
//						System.out.println("tmallDscPrc:[" + element.elementText("tmallDscPrc") + "]");
						//11ST折扣价-每个产品
//						System.out.println("lstTmallDscPrc:[" + element.elementText("lstTmallDscPrc") + "]");
						//卖方折扣价-每个产品
//						System.out.println("lstSellerDscPrc:[" + element.elementText("lstSellerDscPrc") + "]");
						//农村或岛屿的运费
//						System.out.println("bmDlvCst:[" + element.elementText("bmDlvCst") + "]");
						//农村或岛屿的运费-收货时付款（是/否）2014年12月19日（星期五）开始的订单的新功能→ 01 ：预付款→ 02 ：收到后付款→ 04 ：要求向农村地区或岛屿收取额外的运费
//						System.out.println("bmDlvCstType:[" + element.elementText("bmDlvCstType") + "]");
						//货运公司代码
//						System.out.println("dlvEtprsCd:[" + element.elementText("dlvEtprsCd") + "]");
						//邮寄方式 从2015/03/20（星期五）开始的新功能	→ 01 ：快递	→ 04 ：邮件（包裹/已注册）→ 05 ：直接发送（弗里格特派送）→ 06 ：快速服务	→ 99 ：不发货
//						System.out.println("dlvMthdCd:[" + element.elementText("dlvMthdCd") + "]");
						//赠全球运输（是/否）
//						System.out.println("gblDlvYn:[" + element.elementText("gblDlvYn") + "]");
						//运输费用
//						System.out.println("lstDlvCst:[" + element.elementText("lstDlvCst") + "]");
						//支付日期
//						System.out.println("ordStlEndDt:[" + element.elementText("ordStlEndDt") + "]");
						//订单确认日期
//						System.out.println("plcodrCnfDt:[" + element.elementText("plcodrCnfDt") + "]");
						//发货处理日期从2015/03/20（星期五）开始的新功能
//						System.out.println("sndEndDt:[" + element.elementText("sndEndDt") + "]");
						//地址类型→ 01 ：地址数据→ 02 ：街道数据
//						System.out.println("typeAdd:[" + element.elementText("typeAdd") + "]");
						orderList.add(tbOrder);
					}
				}else {
					System.out.println("没有数据");
				}
			}
				
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start) + "ms");
		
		return orderList;
	}
}
