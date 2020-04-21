package cn.edu.bcu.ls.entity;

import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SendMessage {
	 @ApiModelProperty(value = "OpenID")
	private String touser;
	 @ApiModelProperty(value = "模板ID")
	private String template_id;
	 @ApiModelProperty(value = "模板数据")
	private Map<String, Object> data;
}
