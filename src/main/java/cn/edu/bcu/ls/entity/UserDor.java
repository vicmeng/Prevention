package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDor {
	private String user_id;
	private String user_name;
	private String dormitory_build_id;
	private String dormitory_house_id;
}
