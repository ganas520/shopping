package com.flight.china.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.baidu.aip.imageclassify.AipImageClassify;

public class Sample {
    //设置APPID/AK/SK
    private static final String APP_ID = "20264475";
    private static final String API_KEY = "Xx7p6oYAM9ZHX2prO7r02vBH";
    private static final String SECRET_KEY = "GpCjsIb4pss02elkYNDu0g8LLRnQ3ynE";

    public JSONObject getImageMessage() {
    	JSONObject res = null;
    	try {
    		String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
    		// 初始化一个AipImageClassify
    		AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
    		
    		// 可选：设置网络连接参数
//    		client.setConnectionTimeoutInMillis(2000);
//    		client.setSocketTimeoutInMillis(60000);
    		
    		// 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
    		
    		// 调用接口
    		String path = "D:\\project\\springBoot\\src\\main\\resources\\static\\infoImages\\20200606215015.jpg";
    		HashMap<String, String> options = new HashMap<String, String>();
    		options.put("language_type", "CHN_ENG");
    		options.put("detect_direction", "true");
    		options.put("detect_language", "true");
    		options.put("probability", "true");
    	    res = client.advancedGeneral(path, options);
    	    
    		System.out.println(res.toString(2));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		return res;
        
    }
    
    
    
    public static String getAuth(String ak, String sk) {
        // 获取token地址
        String authHost = "https://aip.baidubce.com/oauth/2.0/token?";
        String getAccessTokenUrl = authHost
                // 1. grant_type为固定参数
                + "grant_type=client_credentials"
                // 2. 官网获取的 API Key
                + "&client_id=" + ak
                // 3. 官网获取的 Secret Key
                + "&client_secret=" + sk;
        try {
            URL realUrl = new URL(getAccessTokenUrl);
            // 打开和URL之间的连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.err.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String result = "";
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            /**
             * 返回结果示例
             */
            System.err.println("result:" + result);
            JSONObject jsonObject = new JSONObject(result);
            String access_token = jsonObject.getString("access_token");
            return access_token;
        } catch (Exception e) {
            System.err.printf("获取token失败！");
            e.printStackTrace(System.err);
        }
        return null;
    }
    
    
//    public static void main(String[] args) {
//		String s = "{'log_id': 3541215766138145767, 'words_result_num': 9, 'words_result': [{'words': '冰虎°速冻车载冰箱'}, {'words': '车载冰箱'}]}";
//		JSONObject jsonObject = new JSONObject(s);
//		JSONArray json = jsonObject.getJSONArray("words_result");
//		for(int i = 0; i <json.length(); i++) {
//			JSONObject jsonnew = (JSONObject) json.get(i);
//			System.out.println(jsonnew.get("words"));
//		}
//		System.out.println("json:"+json);
//	}
}
