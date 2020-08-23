package com.flight.china.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Httpget11 {
	public static void main(String[] args) throws URISyntaxException {
		//等待付款清单
//		URI uri = new URIBuilder("https://api.11st.co.kr/rest/ordservices/standby/202007010000/202007070000").setParameter("key", "7013cef58e52edd1118716a33150c7d0").build();
//		String result = Httpget11.get(uri.toString());
//		System.out.println(result);
//		System.out.println(uri.toString());
		
//		List<String> sd = getYearMonth("2020-07");
//		for(int i = 0; i < sd.size(); i+=2) {
//			URI uri = new URIBuilder("https://api.11st.co.kr/rest/ordservices/standby/"+sd.get(i)+"/"+sd.get(i+1)).build();
//			System.out.println(uri.toString());
//			String result = Httpget11.get(uri.toString());
//		}
	}
	
	public static String get(String url) throws URISyntaxException{
		String result = "";
		HttpGet get = new HttpGet(new URIBuilder(url).build());
		try{
			CloseableHttpClient httpClient = HttpClients.createDefault();
			get.addHeader("openapikey","7013cef58e52edd1118716a33150c7d0");
			System.out.println(new URIBuilder(url).build());
			HttpResponse response = httpClient.execute(get);
			response.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//			response.addHeader("openapikey","7013cef58e52edd1118716a33150c7d0");
			
			result = getHttpEntityContent(response);
			System.out.println(result);
			if(response.getStatusLine().getStatusCode()!=HttpStatus.SC_OK){
				result = "服务器异常";
			}
		} catch (Exception e){
			System.out.println("请求异常");
			throw new RuntimeException(e);
		} finally{
			get.abort();
		}
		return result;
	}
	
	public static String getHttpEntityContent(HttpResponse response) throws UnsupportedOperationException, IOException{
		String result = "";
		HttpEntity entity = response.getEntity();
		if(entity != null){
			InputStream in = entity.getContent();
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "ks_c_5601-1987"));
			StringBuilder strber= new StringBuilder();
			String line = null;
			while((line = br.readLine())!=null){
				strber.append(line+'\n');
			}
			br.close();
			in.close();
			result = strber.toString();
		}
		
		return result;
		
	}
	
	public static List<String> getYearMonth(String yearMonth) {
    	List<String> yearMonthStr = new ArrayList<String>();
    	int month = Integer.valueOf(yearMonth.split("-")[1]);
    	int year = Integer.valueOf(yearMonth.split("-")[0]);
    	System.out.println(year);
    	System.out.println(month);
    	if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
    		String months = String.valueOf(month);
    		if(month<10) {
    			months = "0"+month; 
    		}
    		yearMonthStr.add(year+months+"010000");
    		yearMonthStr.add(year+months+"072359");
    		yearMonthStr.add(year+months+"080000");
    		yearMonthStr.add(year+months+"142359");
    		yearMonthStr.add(year+months+"150000");
    		yearMonthStr.add(year+months+"212359");
    		yearMonthStr.add(year+months+"220000");
    		yearMonthStr.add(year+months+"282359");
    		yearMonthStr.add(year+months+"290000");
    		yearMonthStr.add(year+months+"312359");
    	}else if(month == 4 || month == 6 || month ==9 || month == 11) {
    		String months = String.valueOf(month);
    		if(month<11) {
    			months = "0"+month; 
    		}
    		yearMonthStr.add(year+months+"010000");
    		yearMonthStr.add(year+months+"072359");
    		yearMonthStr.add(year+months+"080000");
    		yearMonthStr.add(year+months+"142359");
    		yearMonthStr.add(year+months+"150000");
    		yearMonthStr.add(year+months+"212359");
    		yearMonthStr.add(year+months+"220000");
    		yearMonthStr.add(year+months+"282359");
    		yearMonthStr.add(year+months+"290000");
    		yearMonthStr.add(year+months+"302359");
    	}else if(month == 2) {
    		String months = "0"+month;
    		if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0) {
    			//闰年
    			yearMonthStr.add(year+months+"010000");
        		yearMonthStr.add(year+months+"072359");
        		yearMonthStr.add(year+months+"080000");
        		yearMonthStr.add(year+months+"142359");
        		yearMonthStr.add(year+months+"150000");
        		yearMonthStr.add(year+months+"212359");
        		yearMonthStr.add(year+months+"220000");
        		yearMonthStr.add(year+months+"282359");
        		yearMonthStr.add(year+months+"290000");
        		yearMonthStr.add(year+months+"292359");
    		 }else {
    			yearMonthStr.add(year+months+"010000");
	    		yearMonthStr.add(year+months+"072359");
	    		yearMonthStr.add(year+months+"080000");
	    		yearMonthStr.add(year+months+"142359");
	    		yearMonthStr.add(year+months+"150000");
	    		yearMonthStr.add(year+months+"212359");
	    		yearMonthStr.add(year+months+"220000");
	    		yearMonthStr.add(year+months+"282359");
    		 }
    	}
    	return yearMonthStr;
    }
}
