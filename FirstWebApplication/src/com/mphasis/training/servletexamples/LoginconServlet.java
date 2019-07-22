package com.mphasis.training.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mphasis.cart.bao.CartUserBaoImpl;
import com.mphasis.cart.bao.cartUserBao;
import com.mphasis.training.jdbcprograms.CartUser;

/**
 * Servlet implementation class LoginconServlet
 */
@WebServlet("/edit")
public class LoginconServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	cartUserBao cartUserBao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginconServlet() {
    	cartUserBao=new CartUserBaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		String rol=request.getParameter("role");
		CartUser user=new CartUser();
		
			if(user.getUser_email().equals(name)&&user.getPasswrd().equals(pass)) {
				{
					if(user.getRole().equalsIgnoreCase("admin"))
				
				out.print("welcome"+name+"<br/>");
				response.sendRedirect("editproducts.jsp");
				
				
		}
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
