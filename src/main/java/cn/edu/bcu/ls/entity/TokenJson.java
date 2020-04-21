package cn.edu.bcu.ls.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
public class TokenJson {
	private String access_token;
	private Integer expires_in;
	private Integer errcode;
	private String errmsg;
}
