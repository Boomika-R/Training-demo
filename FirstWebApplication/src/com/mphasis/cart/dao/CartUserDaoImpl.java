package com.mphasis.cart.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mphasis.cart.util.DbUtil;
import com.mphasis.training.jdbcprograms.CartUser;

public class CartUserDaoImpl implements CartUserDao {
Connection con;
public CartUserDaoImpl() {
	con=DbUtil.getConnection();

}
@Override
public void register(CartUser c) {
	try {
	String sql="insert into cartuser values (?,?,?,?,sysdate,?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setInt(1,c.getUserid());
	pst.setString(2,c.getUser_name() );
	pst.setString(3, c.getUser_email());
	pst.setString(4, c.getPasswrd());
	pst.setLong(5,c.getCreditcard());
	pst.setString(6,c.getGender());
	pst.setString(7,c.getRole());
	pst.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	
	}
	
}
@Override
public CartUser login(String user_email, String passwrd) {
	CartUser c=new CartUser();
	try {
		
		PreparedStatement pst=con.prepareStatement("select * from cartuser where user_email=? and passwrd=?");
		pst.setString(1,user_email);
		pst.setString(2,passwrd);
		
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			c.setUserid(rs.getInt(1));
			c.setUser_name(rs.getString(2));
			c.setUser_email(rs.getString(3));
	        c.setPasswrd(rs.getString(4));
	        c.setD_o_r(rs.getDate(5));
			c.setCreditcard(rs.getLong(6));
			c.setGender(rs.getString(7));
			c.setRole(rs.getString(8));
		}
	
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	return c;
}
@Override
public int changePassword(String user_email, String oldpasswrd,String newpasswrd) {

	int i=0;
	try {
		PreparedStatement pst=con.prepareStatement(
				"update cartuser set passwrd=? where user_email=? and passwrd=?");
		pst.setString(1, newpasswrd);
		pst.setString(2, user_email);
		pst.setString(3, oldpasswrd);
	    i=pst.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return i;
}
}



