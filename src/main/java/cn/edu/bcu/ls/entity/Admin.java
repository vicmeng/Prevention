package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Admin {
	private int admin_id;
	private String admin_number;
	private String admin_password;
	private String admin_phone;
}
