package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DormitoryNumber {
	private Integer dormitory_id;
	private String dormitory_build_id;
	private String dormitory_house_id; 
}
