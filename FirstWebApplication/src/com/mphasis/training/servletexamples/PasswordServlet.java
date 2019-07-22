package com.mphasis.training.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.cart.bao.CartUserBaoImpl;
import com.mphasis.cart.bao.cartUserBao;
import com.mphasis.cart.exceptions.BusinessException;



/**
 * Servlet implementation class PasswordServlet
 */
@WebServlet("/changepassword")
public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	cartUserBao cartUserBao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordServlet() {
    	cartUserBao=new CartUserBaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String mail=request.getParameter("email");
		String pass1=request.getParameter("pwd");
		String pass2=request.getParameter("pwd1");
		try {
			int i=cartUserBao.changePassword(mail,pass1, pass2);
			if(i>0) {
		    out.print("successfully changed");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			}	
		}catch(BusinessException e)
		{
			out.print(e.getMessage());
			RequestDispatcher rd=request.getRequestDispatcher("menu.html");
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
