package cn.eud.bcu.ls.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Clock implements Serializable{
	private int clock_id;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy年MM月dd日HH点mm分ss秒")
	private Date clock_time;
	private int clock_state;
	private int pic_id;
	private int user_id;
	private float clock_temp;
}
