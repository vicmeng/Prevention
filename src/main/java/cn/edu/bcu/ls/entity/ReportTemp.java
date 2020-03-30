package cn.edu.bcu.ls.entity;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportTemp {
	private String user_name;
	private List<UserTemp> userTemps;
}
