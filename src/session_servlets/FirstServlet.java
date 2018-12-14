package session_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = -3554521177789692486L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("userName");
		pw.print("Pozdrav "+name);
		
		//create http session for trackng this user
		HttpSession session = request.getSession();
		session.setAttribute("uname", name);
		
		pw.println("<a href='servlet2'>visit</a>");
		pw.close();
	}
	
}
