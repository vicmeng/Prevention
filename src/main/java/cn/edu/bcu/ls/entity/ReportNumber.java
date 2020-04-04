package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportNumber {
	private Integer report_id;
	private String report_student_id;
	private String report_teacher_id;
	private Integer clazz_id;
	private String teacher_id;
	private Integer dep_id;
	
}
