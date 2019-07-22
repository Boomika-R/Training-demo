package com.mphasis.training.testcases;



public class Testing {
	String s;
	
	public String Display(String s) {
		if(s.charAt(0)=='A'||s.charAt(1)=='A')
		{
	s=s.replaceFirst("A"," ");
		}
	  return s.trim();
		
	}
	public void Trim(String s) {
		for(int i=0;i<s.length();i++) {
	if(s.substring(0,1).equals(s.substring(s.length()-2, s.length()-1)))
			{
		System.out.println("true");
		}
	else
		System.out.println("false");
	}
		
	
	
}}
	
	
	
	

