package com.mphasis.training.testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hash {
	Map<String,String> h1=new HashMap<>();
	
	
public void addEmployee(String id,String email) {
if(isValid(email))
	h1.put(id,email);
}
public String getEmployee(String id) {
	return h1.get(id);
}
public static boolean isValid(String email)
{
String reg="*([A_Za-z0-9.!#$%&*]+)@([a-z]{2,12}).(com|co.in)";
	Pattern p=Pattern.compile(reg);
	Matcher m=p.matcher(email);
	return m.matches();
}

}