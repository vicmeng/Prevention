package cn.eud.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notice {
	private int notice_id;
	private String notice_text;
	private String notice_pic;
	private int admin_id;
	
}
