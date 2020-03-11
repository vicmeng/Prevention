package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class User{
	private int user_id;
	private String user_name;
	private String user_pwd;
	private String user_school;
	private int user_integral;
	private String user_phonenumber;
	private int user_type;
	private String user_schoolnumber;
	private int class_id;
	private int dormitory_id;
	

}
