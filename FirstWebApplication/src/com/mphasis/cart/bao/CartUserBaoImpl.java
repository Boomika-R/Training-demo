package com.mphasis.cart.bao;

import com.mphasis.cart.dao.CartUserDao;
import com.mphasis.cart.dao.CartUserDaoImpl;
import com.mphasis.cart.exceptions.BusinessException;
import com.mphasis.training.jdbcprograms.CartUser;

public class CartUserBaoImpl implements cartUserBao {
	
	CartUserDao cartUSerDao;
	
	public CartUserBaoImpl() {
		cartUSerDao=new CartUserDaoImpl();
	}
	
	@Override
	public void register(CartUser user) throws BusinessException {
	if(user.getGender().matches("[fFmM]{1}")) {
			cartUSerDao.register(user);
			
		}else {
			throw new BusinessException("entered invalid gender");
		}
	}

	
	@Override
	public int changePassword(String user_email, String oldpasswrd,String newpasswrd) throws BusinessException {
  int i=0;
if(!oldpasswrd.equals(newpasswrd))
{
	  cartUSerDao.changePassword(user_email,oldpasswrd,newpasswrd);
}
		else
		{
		throw new BusinessException("old and new password should not be same");
		}
return i;
	}

	@Override
	public CartUser login(String user_email,String passwrd) {
		
		return cartUSerDao.login(user_email,passwrd);
	}

}
