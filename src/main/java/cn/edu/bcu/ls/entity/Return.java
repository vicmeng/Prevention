package cn.edu.bcu.ls.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Return implements Serializable{
	private int ret_id;
	private int user_id;
	private String ret_place;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy年MM月dd日HH点mm分ss秒")
	private Date ret_time;
	private String ret_prove;
	

}
