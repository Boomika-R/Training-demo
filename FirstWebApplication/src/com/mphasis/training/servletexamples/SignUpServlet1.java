package com.mphasis.training.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;

import com.mphasis.cart.bao.CartUserBaoImpl;
import com.mphasis.cart.bao.cartUserBao;
import com.mphasis.training.jdbcprograms.CartUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SignUpServlet1
 */
@WebServlet("/signupcart")
public class SignUpServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	cartUserBao cartUserBao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet1() {
    	cartUserBao=new CartUserBaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname=request.getParameter("uname");
		String em=request.getParameter("nm");
		String pass=request.getParameter("pwd");
		
	    long cre=Long.parseLong(request.getParameter("cr"));
		String gen=request.getParameter("gen");
		CartUser user=new CartUser();
		user.setUserid(uid);
		user.setUser_name(uname);
		user.setUser_email(em);
		user.setPasswrd(pass);
		
		user.setCreditcard(cre);
		user.setGender(gen);
		try {
			cartUserBao.register(user);
			RequestDispatcher rd=request.getRequestDispatcher("menu.html");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			out.println("Invalid credentials");
		RequestDispatcher rd=request.getRequestDispatcher("signupcart.html");
			rd.include(request, response);
		}
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
