package com.mphasis.cart.dao;
import com.mphasis.training.jdbcprograms.CartUser;

public interface CartUserDao {
	public void register(CartUser c);
	public CartUser login(String user_email,String passwrd);
	public int changePassword(String user_email,String oldpasswrd,String newpasswrd);
	

}
