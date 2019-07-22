package com.mphasis.training.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mphasis.cart.dao.ProductDao;
import com.mphasis.cart.dao.ProductDaoImpl;
import com.mphasis.training.jdbcprograms.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDao productDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
    	productDao=new ProductDaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products=productDao.getAll();
		HttpSession session=request.getSession();
		
		session.setAttribute("products", products);
		response.sendRedirect("products.jsp");
		
//		response.setHeader("cache-Control","no-cache,no-store,must-revalidate");
//		response.setHeader("Pragma","no-cache");
//		response.setHeader("Expires","0");
//		PrintWriter out=response.getWriter();
//		response.setContentType("text/html");
//		try {
//		HttpSession session=request.getSession(false);
//		
//		String s=session.getAttribute("sname").toString();
//		
//		out.print("Product page"+s);
//		RequestDispatcher rd=request.getRequestDispatcher("menu.html");
//		
//		List<Product> products=productDao.getAll();
//		out.print("<table border='1'>");
//		out.print("<tr><th>PID</th><th>PNAME</th><th>COST</th><th>Quantity</th><th>BUY</th></tr>");
//		for(Product p:products) {
//			out.print("<tr>");
//			out.print("<td>"+p.getP_id()+"</td>");
//			out.print("<td>"+p.getP_name()+"</td>");
//			out.print("<td>"+p.getCost()+"</td>");
//			out.print("<td>"+p.getQuantity()+"</td>");
//			out.print("<td><a>BUY</a></td>");
//			out.print("</tr>");
//			              		}
//		  out.print("</table>");
//		
//		rd.include(request, response);
//		}catch(NullPointerException e) {
//			out.print("login first");
//			RequestDispatcher rd=request.getRequestDispatcher("login.html");
//			rd.include(request, response);
//
//		}
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
