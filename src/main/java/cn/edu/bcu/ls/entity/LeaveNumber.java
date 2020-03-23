package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LeaveNumber {
	 @ApiModelProperty(value = "请假id")
	private Integer leave_id;
	 @ApiModelProperty(value = "用户id")
	private String user_id;
	@ApiModelProperty(value = "请假类别 0：事假 1：病假")
	private Integer leave_type;
	@ApiModelProperty(value = "请假状态 0：未审核 1：驳回 2：通过")
	private Integer leave_state;
	@ApiModelProperty(value ="班级id")
	private Integer clazz_id;
	@ApiModelProperty(value="辅导员id")
	private String clazz_teacher_id;
	
}
