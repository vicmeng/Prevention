package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClockNumber {
	private Integer clock_id;
	private String user_id;
	private Integer clock_state;
	private String  teacher_id;
	private Integer clazz_id;
	private Integer dormitory_id;
	private Integer dep_id;
	private Float clock_temp;
}
