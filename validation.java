package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/valid")
public class validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("control in servlet1");
	
	String userName=request.getParameter("userName");
	String userPassword=request.getParameter("userPassword");
	
	System.out.println(userName+""+userPassword);
	if(userName.equals("krishna") && userPassword.equals("yadav"))
	{
		RequestDispatcher reqDisp=request.getRequestDispatcher("/home.jsp");
		reqDisp.forward(request, response);
	}
	else
	{
		ServletContext servletContext=request.getServletContext();
		RequestDispatcher reqDisp=servletContext.getRequestDispatcher("/error.jsp");
		reqDisp.forward(request, response);
	}
		
	}

}
