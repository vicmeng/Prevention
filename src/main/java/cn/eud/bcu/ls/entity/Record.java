package cn.eud.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Record {
	private int rec_id;
	private int user_id;
	private int rec_like;
	private int rec_state;
	private int text;
	
	
	
	
}
