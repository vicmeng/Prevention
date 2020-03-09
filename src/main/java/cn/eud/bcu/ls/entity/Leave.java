package cn.eud.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Leave {
	private int leave_id;
	private int leave_state;
	private String leave_evidence;
	private String leave_text;
	private int user_id;
}
