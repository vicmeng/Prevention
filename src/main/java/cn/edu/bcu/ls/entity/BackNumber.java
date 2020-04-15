package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BackNumber {
	@ApiModelProperty(value = "返回id")
	private Integer back_id;
	@ApiModelProperty(value = "用户id")
	private String user_id;
	@ApiModelProperty(value = "是否审批 0：无 1：有")
	private Integer back_state;
	@ApiModelProperty(value = "返校类别 0：申请 1：登记")
	private Integer back_type;
	@ApiModelProperty(value = "老师id")
	private String clazz_teacher_id;
}
