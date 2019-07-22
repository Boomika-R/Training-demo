package com.mphasis.cart.bao;

import com.mphasis.cart.exceptions.BusinessException;
import com.mphasis.training.jdbcprograms.CartUser;

public interface cartUserBao {
public void register(CartUser user)throws BusinessException;
public int changePassword(String user_email,String oldpasswrd,String newpasswrd)throws BusinessException;
public CartUser login(String user_email,String passwrd);
 
 

}
