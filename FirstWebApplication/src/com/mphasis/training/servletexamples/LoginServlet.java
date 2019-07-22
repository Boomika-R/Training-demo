package com.mphasis.training.servletexamples;

import java.io.IOException;

import com.mphasis.cart.bao.CartUserBaoImpl;
import com.mphasis.cart.bao.cartUserBao;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mphasis.training.jdbcprograms.CartUser;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	cartUserBao cartUserBao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	cartUserBao=new CartUserBaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		CartUser user=cartUserBao.login(name, pass);
		System.out.println("servlet called");
		try{
			if(user.getUser_email().equals(name)&&user.getPasswrd().equals(pass))
				if(user.getRole().equalsIgnoreCase("admin")) {
				
				out.print("welcome"+name+"<br/>");
				RequestDispatcher rd=request.getRequestDispatcher("menu.html");
				rd.include(request, response);
				HttpSession session=request.getSession();
				session.setAttribute("sname", name);
		}else
		{
			
		out.print("welcome"+name+"<br/>");
		RequestDispatcher rd=request.getRequestDispatcher("buyer.html");
		rd.include(request, response);
		HttpSession session=request.getSession();
		session.setAttribute("sname", name);
		}
				
		}catch(Exception e)
		{
					out.print("invalid");
					RequestDispatcher rd=request.getRequestDispatcher("login.html");
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
