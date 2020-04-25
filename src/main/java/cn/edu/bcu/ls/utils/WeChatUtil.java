package cn.edu.bcu.ls.utils;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.edu.bcu.ls.entity.OpenIdJson;
import cn.edu.bcu.ls.entity.SendJosn;
import cn.edu.bcu.ls.entity.SendMessage;
import cn.edu.bcu.ls.entity.TokenJson;
@Component
@ConfigurationProperties
public class WeChatUtil {
	@Value("${appID}")
	private   String appID;
	@Value("${appSecret}")
    private   String appSecret;

    /**
     * 
     * @param code
     * @return 返回openid
     * @throws IOException
     */
    public  String userLogin(@RequestParam("code") String code) throws IOException {
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + appID + "&secret="
                            + appSecret + "&js_code="
                            + code
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        OpenIdJson openIdJson = mapper.readValue(result,OpenIdJson.class);
        System.out.println(result.toString());
        System.out.println(openIdJson.getOpenid());
        return result;
    }
    /**
     * 
     * @return 返回token
     * @throws IOException
     */
    public  TokenJson getAccessToken() throws IOException {
    	System.out.println(appID);
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
                            + appID+"&secret="+appSecret , null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        TokenJson tokenJson = mapper.readValue(result,TokenJson.class);
       
        return tokenJson;
    }
    
    public  SendJosn sendJosn(TokenJson tokenJson,String sendMessage) throws JsonMappingException, JsonProcessingException {
    	String result = "";
    	
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doPost("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token="+tokenJson.getAccess_token(), sendMessage);
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       
        ObjectMapper mapper = new ObjectMapper();
        SendJosn sendJosn = mapper.readValue(result,SendJosn.class);
        System.out.println(result.toString());
       
        return sendJosn;
    }
}
