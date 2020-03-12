package cn.edu.bcu.ls.entity;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cn.edu.bcu.ls.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import springfox.documentation.annotations.ApiIgnore;

@ApiModel(value = "cn-edu-bcu-ls-entity-User")
@Data
@NoArgsConstructor
public class User {
	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private String userId;

	/**
	 * 微信的openid
	 */
	@ApiModelProperty(value = "微信的openid")
	private String userOpenid;

	/**
	 * 所属学部id
	 */
	@ApiModelProperty(value = "所属学部id")
	private Integer depId;
	@IgnoreSwaggerParameter
	private Department department;
	/**
	 * 班级id
	 */
	@ApiModelProperty(value = "班级id")
	private Integer classId;
	@IgnoreSwaggerParameter
	private Clazz clazz;
	/**
	 * 宿舍id
	 */
	@ApiModelProperty(value = "宿舍id")
	private Integer dormitoryId;
	@IgnoreSwaggerParameter
	private Dormitory dormitory;
	
	
	/**
	 * 用户姓名
	 */
	@ApiModelProperty(value = "用户姓名")
	private String userName;

	/**
	 * 用户密码
	 */
	@ApiModelProperty(value = "用户密码")
	private String userPwd;

	/**
	 * 用户积分
	 */
	@ApiModelProperty(value = "用户积分")
	private Integer userIntegral;

	/**
	 * 用户手机号
	 */
	@ApiModelProperty(value = "用户手机号")
	private String userPhone;

	/**
	 * 0：学生 1：专业老师 2：辅导员 3：学部主任 4：学管负责人 5：校长
	 */
	@ApiModelProperty(value = "0：学生 1：专业老师  2：辅导员 3：学部主任 4：学管负责人 5：校长")
	private Integer userType;

	/**
	 * 用户状态 0：正常 1：隔离 2：上报
	 */
	@ApiModelProperty(value = "用户状态 0：正常 1：隔离 2：上报")
	private Integer userState;

	

	
	
	
}