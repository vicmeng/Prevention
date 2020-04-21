package cn.edu.bcu.ls.utils;

import java.io.IOException;

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


public class WeChatUtil {
	private static final String appID = "wx18730db465609fcf";
    private static final String appSecret = "0dc7725dc6872230d6cb1c2af2e930c8";

    
    public static String userLogin(@RequestParam("code") String code) throws IOException {
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
    public static TokenJson getAccessToken() throws IOException {
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
        System.out.println(result.toString());
        System.out.println(tokenJson.toString());
        return tokenJson;
    }
    
    public static SendJosn sendJosn(TokenJson tokenJson,SendMessage sendMessage) throws JsonMappingException, JsonProcessingException {
    	String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token=" 
            		+tokenJson.getAccess_token()
            		+"&touser="+sendMessage.getTouser()
            		+"&template_id="+sendMessage.getTemplate_id()
            		+"&data="+sendMessage.getData(), null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        SendJosn sendJosn = mapper.readValue(result,SendJosn.class);
        System.out.println(result.toString());
        System.out.println(tokenJson.toString());
        return sendJosn;
    }
}
