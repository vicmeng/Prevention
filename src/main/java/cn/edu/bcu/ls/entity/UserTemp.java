package cn.edu.bcu.ls.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class UserTemp {
	private Integer clock_id;
	private String user_id;
	private Float clock_temp;
	 @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
	private Date clock_time;
}
