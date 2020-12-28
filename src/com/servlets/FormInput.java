package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.*;
import com.entity.Product;

/**
 * Servlet implementation class FormInput
 */
@WebServlet("/FormInput")
public class FormInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		float price = Float.parseFloat(request.getParameter("price"));

		Session session = HibernateUtility.getSession();

		Transaction transaction = session.beginTransaction();

		Product p = new Product(name, category, price);

		session.save(p);
		

		transaction.commit();
		
		session.close();

		response.sendRedirect("addSuccess.jsp");
	}

}
