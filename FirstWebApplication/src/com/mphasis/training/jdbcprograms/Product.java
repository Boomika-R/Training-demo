package com.mphasis.training.jdbcprograms;

public class Product {
	private int p_id;
	private String p_name;
	private double cost;
	private int quantity;
	
	public Product() {
		super();
	}
	public Product(int p_id, String p_name, double cost, int quantity) {
		
		this.p_id = p_id;
		this.p_name = p_name;
		this.cost = cost;
		this.quantity = quantity;
	}
	public int getP_id() {
		return p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public double getCost() {
		return cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	}



