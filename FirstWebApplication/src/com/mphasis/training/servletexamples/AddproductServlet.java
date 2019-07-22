package com.mphasis.training.servletexamples;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class AddproductServlet
 */
@WebServlet("/AddproductServlet")
public class AddproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDao productDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddproductServlet() {
    	productDao=new ProductDaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("p_id");
		if(id.isEmpty()) 
		    {
			String name=request.getParameter("p_name");
		    double cos=Double.parseDouble(request.getParameter("cost"));
	        int qua=Integer.parseInt(request.getParameter("quantity"));
			Product product=new Product();
			product.setP_name(name);
			product.setCost(cos);
			product.setQuantity(qua);
			 productDao.addProduct(product);
			
			List<Product> products=productDao.getAll();
			HttpSession session=request.getSession();
			session.setAttribute("Product",products);
			request.getRequestDispatcher("products.jsp").forward(request, response);
		    }
		   else
		    {
			int pid=Integer.parseInt(id);
			String name=request.getParameter("p_name");
		    double cos=Double.parseDouble(request.getParameter("cost"));
	        int qua=Integer.parseInt(request.getParameter("quantity"));
			
		    productDao.updateProduct(pid,name,cos,qua);
		   
		     List<Product> products=productDao.getAll();
			HttpSession session=request.getSession();
			session.setAttribute("Product",products);
			request.getRequestDispatcher("products.jsp").forward(request, response);
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
//String pid=request.getParameter("pid");
//String name=request.getParameter("pname");
//String cos=request.getParameter("cost");
//String qua=request.getParameter("quantity");
//Product p=new Product();