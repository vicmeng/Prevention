package cn.edu.bcu.ls.entity;

public class OpenIdJson {
	private String openid;
	private String session_key;

	
	
	public OpenIdJson(String openid, String session_key) {
		super();
		this.openid = openid;
		this.session_key = session_key;
	}
	

	public OpenIdJson() {
		super();
	}


	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getSession_key() {
		return session_key;
	}

	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}
}
