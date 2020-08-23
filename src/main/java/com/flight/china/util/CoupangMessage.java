package com.flight.china.util;

import com.coupang.openapi.sdk.Hmac;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultDnsResolver;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;

public class CoupangMessage {
	
    private static final String HOST = "api-gateway.coupang.com";
    private static final int PORT = 443;
    private static final String SCHEMA = "https";
    //replace with your own accessKey
    private static final String ACCESS_KEY = "d33d54b0-03cb-4e39-b6a7-40741aa095f4";
    //replace with your own secretKey
    private static final String SECRET_KEY = "b72ee7bfc41d401b183c048740e7d6eaaf88a47b";

    public static void test() throws UnsupportedEncodingException {
        //params
        String method = "POST";
                        

        String path = "/v2/providers/marketplace_openapi/apis/api/v1/vendor/shipping-place/outbound";
        
        //replace with your own product registration json data
        String strjson="";
        JSONObject json = new JSONObject();
        json.put("createdAtFrom", "2017-10-10");
        json.put("createdAtTo", "2020-06-11");
        json.put("maxPerPage", 1);
        json.put("status", "FINAL_DELIVERY");
        
        
//        System.out.println(URLEncoder.encode("?","utf-8"));
//        System.out.println(URLEncoder.encode("%3F","utf-8"));
        
        CloseableHttpClient client = null;
        try {
        	//伪造ip
        	
        	
//        	System.setProperty("sun.net.spi.nameservice.nameservers", "168.126.63.1");
//        	System.setProperty("sun.net.spi.nameservice.provider.1", "dns,dnsjava");
//        	System.setProperty("sun.net.spi.nameservice.provider.1", "default");
//        	System.getProperties().setProperty("https.proxyHost", "8.210.98.46");
//        	System.getProperties().setProperty("https.proxyPort", "8479");
//        	System.out.println(getHtml("http://www.ip138.com/ip2city.asp")); 
            //create client
        	
        	
//        	DnsResolver dnsResolver = new SystemDefaultDnsResolver() {
//                @Override
//                public InetAddress[] resolve(final String host) throws UnknownHostException {
//                	System.out.println("host:"+host);
//                	System.out.println(InetAddress.getByName("168.126.63.1"));
//                    if (host.equalsIgnoreCase("api-gateway.coupang.com")) {
//                        return new InetAddress[]{InetAddress.getByName("dc1.oldvpn.com")};
//                    } else {
//                        return super.resolve(host);
//                    }
//                }
//            };
     
//            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
//                    .register("http", PlainConnectionSocketFactory.getSocketFactory())
//                    .register("https", SSLConnectionSocketFactory.getSocketFactory())
//                    .build();
//        	
        	
//        	PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry, dnsResolver);
//        	
//            client =  HttpClients.custom().setConnectionManager(connManager).build();
            //build uri
            client = HttpClients.createDefault();
            URIBuilder uriBuilder = new URIBuilder().setPath(path);

            /********************************************************/
            //authorize, demonstrate how to generate hmac signature here
            String authorization = Hmac.generate(method, uriBuilder.build().toString(), SECRET_KEY, ACCESS_KEY);
            //print out the hmac key
            System.out.println(authorization);
            /********************************************************/

            uriBuilder.setScheme(SCHEMA).setHost(HOST).setPort(PORT);
            System.out.println("url:"+uriBuilder.build().toString());
            HttpPost requestPost = new HttpPost(uriBuilder.build().toString());
//            HttpHost proxy = new HttpHost("218.146.11.198");
            
//            RequestConfig reqConfig = RequestConfig.custom()
//    				.setExpectContinueEnabled(false).setProxy(new HttpHost("8.210.98.46", 7052))
//    				.build();
//            requestPost.setConfig(reqConfig);
          //设置请求头消息
//          requestPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36");
//            requestPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36");
            
          StringEntity params =new StringEntity(json.toString(),"UTF-8");
//            StringEntity params =new StringEntity(json.toString(),"UTF-8");
            System.out.println("json:"+json.toString());
            
            /********************************************************/
            // set header, demonstarte how to use hmac signature here
//            requestPost.addHeader("x-forwarded-for","218.146.11.198");
            requestPost.addHeader("Authorization", authorization);
            /********************************************************/
            requestPost.addHeader("content-type", "application/json");
//            requestPost.addHeader("x-forwarded-for","23.35.220.26");
            System.out.println("params:"+params);
            requestPost.setEntity(params);
            CloseableHttpResponse response = null;
            System.out.println("请求头："+requestPost.getAllHeaders());
            try {
                //execute post request
            	
            	
            	
                response = client.execute(requestPost);
                
                int statusCode = response.getStatusLine().getStatusCode();
    			System.out.println(statusCode);
                
                //print result
                System.out.println("status code:" + response.getStatusLine().getStatusCode());
                System.out.println("status message:" + response.getStatusLine().getReasonPhrase());
                HttpEntity entity = response.getEntity();
                System.out.println("result:" + EntityUtils.toString(entity));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (response != null) {
                    try {
                    	System.out.println("?????????");
                        response.close();
                        requestPost.abort();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    public static void main(String[] args) throws IOException {
//        test hmacTest = new test();
//        hmacTest.test();
//        InetAddress address3 = InetAddress.getByName("api-gateway.coupang.com");  
//
//        System.out.println("计算机名" + address3.getLocalHost());  
    	
    	
    	
//    	getDns();
//    }
    
    
    
    public static void getDns() throws IOException {
    	Process p = Runtime.getRuntime().exec("ipconfig /all");
    	BufferedReader br = new BufferedReader(new InputStreamReader(p
    	                 .getInputStream()));
    	         String inline;
    	         while ((inline = br.readLine()) != null) {
    	             System.out.println(inline);
    	             
    	         }
    	         br.close();
    }
    
    
    
    
    private static void setDns() {
    	DnsResolver dnsResolver = new SystemDefaultDnsResolver() {
    	       @Override
    	       public InetAddress[] resolve(final String host) throws UnknownHostException {
    	    	   System.out.println("host:"+host);
    	           if (host.equalsIgnoreCase("my.host.com")) {
    	               /* If we match the host we're trying to talk to, 
    	                  return the IP address we want, not what is in DNS */
    	               return new InetAddress[] { InetAddress.getByName("168.126.36.1") };
    	           } else {
    	               /* Else, resolve it as we would normally */
    	               return super.resolve(host);
    	           }
    	       }
    	};
    }
    
    
    
    
    
    
    
    
    
    
    
}



























