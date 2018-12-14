package session_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet{

	private static final long serialVersionUID = 1582533384840178007L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//retrieve session from request object and getting information about name
		HttpSession sess = request.getSession(false);  //false, because we dont want to create new session if doesnt exist.. just get back session object if exist 
		String name = (String)sess.getAttribute("uname");
		
		sess.invalidate();
		pw.println("CAOO "+name);
		pw.close();
	}
	
}
