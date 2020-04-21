package cn.edu.bcu.ls.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.httpclient.HttpStatus;

public class HttpUtil {
	 public static String doGet(String urlPath, HashMap<String, Object> params)
	            throws Exception {
	        StringBuilder sb = new StringBuilder(urlPath);
	        if (params != null && !params.isEmpty()) { // 说明有参数
	            sb.append("?");

	            Set<Entry<String, Object>> set = params.entrySet();
	            for (Entry<String, Object> entry : set) { // 遍历map里面的参数
	                String key = entry.getKey();
	                String value = "";
	                if (null != entry.getValue()) {
	                    value = entry.getValue().toString();
	                    // 转码
	                    value = URLEncoder.encode(value, "UTF-8");
	                }
	                sb.append(key).append("=").append(value).append("&");
	            }

	            sb.deleteCharAt(sb.length() - 1); // 删除最后一个&
	        }
	        // System.out.println(sb.toString());
	        URL url = new URL(sb.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setConnectTimeout(5000); // 5s超时
	        conn.setRequestMethod("GET");

	        if (conn.getResponseCode() == HttpStatus.SC_OK) {// HttpStatus.SC_OK ==
	            // 200
	            BufferedReader reader = new BufferedReader(new InputStreamReader(
	                    conn.getInputStream()));
	            StringBuilder sbs = new StringBuilder();
	            String line;
	            while ((line = reader.readLine()) != null) {
	                sbs.append(line);
	            }
	            return sbs.toString();
	        }

	        return null;
	    }
	 public static String doPost(String urlPath,String params)
	            throws Exception {
	        
		 
		 URL url = new URL(urlPath);
         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("POST"); 
         connection.setDoOutput(true);
         connection.setDoInput(true);
         connection.setUseCaches(false);
         connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");//设置参数类型是json格式
         connection.connect();

      
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(), "UTF-8"));
         writer.write(params);
         writer.close();
		 
	        if (connection.getResponseCode() == HttpStatus.SC_OK) {// HttpStatus.SC_OK ==
	            // 200
	            BufferedReader reader = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
	            StringBuilder sbs = new StringBuilder();
	            String line;
	            while ((line = reader.readLine()) != null) {
	                sbs.append(line);
	            }
	            return sbs.toString();
	        }

	        return null;
	    }
}
