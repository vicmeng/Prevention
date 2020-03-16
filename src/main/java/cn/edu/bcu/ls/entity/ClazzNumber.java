package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClazzNumber {
	private Integer clazz_id;
	private Integer dep_id;
	private String clazz_teacher_id;
}
