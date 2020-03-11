package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Traffic {
	private int tra_id;
	private String tra_name;
	private int ret_id;
	private String ret_path;
	

}
