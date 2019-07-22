package com.mphasis.cart.dao;
import java.util.List;

import com.mphasis.training.jdbcprograms.Product;
public interface ProductDao {

	public int addProduct(Product p);
	public int updateProduct(int p_id,String p_name,double cost,int quantity);
	public int deleteProduct(int p_id);
	public Product getById(int p_id);
	public List<Product> getProductByName(String name);
	public List<Product> getAll();
	public int addToCart(String email,int p_id);	
	
	
}
