package cn.edu.bcu.ls.entity;

import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SendMessage {
	 @ApiModelProperty(value = "OpenID")
	private String touser;
	 @ApiModelProperty(value = "模板ID")
	private String template_id;
	 
	 private Map<String, Object> data=null;
}
