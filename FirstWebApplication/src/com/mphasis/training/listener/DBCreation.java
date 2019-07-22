/*package com.mphasis.training.listener;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


*//**
 * Application Lifecycle Listener implementation class DBCreation
 *
 *//*
@WebListener
public class DBCreation implements ServletContextListener, ServletContextAttributeListener {

    *//**
     * Default constructor. 
     *//*
    public DBCreation() {
        // TODO Auto-generated constructor stub
    }

	*//**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     *//*
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    }

	*//**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     *//*
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    }

	*//**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     *//*
    public void contextDestroyed(ServletContextEvent sce)  { 

        
    }
	
    

	*//**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     *//*
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    }

	*//**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     *//*
    public void contextInitialized(ServletContextEvent sce)  { 
   
        try {
        	Class.forName("oracle.jdbc.OracleDriver");
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","boomika","boomika");
        	Statement st=con.createStatement();
        	String sql="create table prod(pid number,pname varchar(23),cost number,quan number)";
        	st.execute(sql);
        	System.out.println("table created");
        	 }catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
	
}
*/