package com.mphasis.cart.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.cart.util.DbUtil;
import com.mphasis.training.jdbcprograms.Product;

public class ProductDaoImpl implements ProductDao {
	Connection con;
	public ProductDaoImpl() {
		con=DbUtil.getConnection();

		
	}
	
	
	@Override
	public int addProduct(Product p) {
		int i = 0;
		try {
			String sql="insert into product values(sequence1.nextval,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,p.getP_name());
			pst.setDouble(2,p.getCost());
			pst.setInt(3, p.getQuantity());
			i=pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateProduct(int p_id,String p_name,double cost, int quantity) {
		int i=0;
		try {
			String sql="update product set cost=?,p_name=?,quantity=? where p_id=?";
	 PreparedStatement pst=con.prepareStatement(sql);
			pst.setDouble(1,cost);
			pst.setString(2,p_name);
			pst.setInt(3,quantity);
			pst.setInt(4,p_id);
			i=pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteProduct(int p_id) {
		int i=0;
				try {
					String sql="delete from product  where p_id=?";
					PreparedStatement pst=con.prepareStatement(sql);
					pst.setInt(1,p_id);
					pst.executeUpdate();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		return i;
	}

	@Override
	public Product getById(int p_id) {
		Product p=new Product();
		try {
			String sql="select * from product where p_id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1,p_id);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				p.setP_id(rs.getInt(1));
				p.setP_name(rs.getString(2));
				p.setCost(rs.getDouble(3));
				p.setQuantity(rs.getInt(4));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Product> getProductByName(String p_name) {
		List<Product> products=new ArrayList<>();
		try {
			String sql="select * from product where p_name=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,p_name);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
			Product p=new Product();
			p.setP_id(rs.getInt(1));
			p.setP_name(rs.getString(2));
			p.setCost(rs.getDouble(3));
			p.setQuantity(rs.getInt(4));
			products.add(p);
			}
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
		
	}

	@Override
	public List<Product> getAll() {
		List<Product> products=new ArrayList<>();
		try {
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("select *from product");
			while(rs.next()) {
			Product p=new Product();
			p.setP_id(rs.getInt(1));
			p.setP_name(rs.getString(2));
			p.setCost(rs.getDouble(3));
			p.setQuantity(rs.getInt(4));
			products.add(p);
			
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}


	@Override
	public int addToCart(String email, int p_id) {
		int i=0;
		try {
			String sql="insert into buy values(buy1.nextval,?,?,sysdate)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, p_id);
			pst.setString(2, email);
			i=pst.executeUpdate();	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
