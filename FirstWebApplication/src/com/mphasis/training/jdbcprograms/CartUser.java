package com.mphasis.training.jdbcprograms;

import java.util.Date;

public class CartUser {
	private int userid;
	private String user_name;
	private String user_email;
	private String passwrd;
	private Date d_o_r;
	private long creditcard;
	private String gender;
	private String role;
	public String getRole() {
		return role;
	}
	
	public CartUser() {
		super();
		
	}
	@Override
	public String toString() {
		return "CartUser [userid=" + userid + ", user_name=" + user_name + ", user_email=" + user_email + ", passwrd="
				+ passwrd + ", d_o_r=" + d_o_r + ", creditcard=" + creditcard + ", gender=" + gender + ", role=" + role
				+ "]";
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public void setD_o_r(Date d_o_r) {
		this.d_o_r = d_o_r;
	}
	public void setCreditcard(long creditcard) {
		this.creditcard = creditcard;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getUserid() {
		return userid;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public Date getD_o_r() {
		return d_o_r;
	}
	public long getCreditcard() {
		return creditcard;
	}
	public String getGender() {
		return gender;
	}
	
	
	public void getUser_id(int int1) {
		// TODO Auto-generated method stub
		
	}
}
