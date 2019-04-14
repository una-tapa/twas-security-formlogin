package ht.twas.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloHiroko
 */
@WebServlet("/HelloIBM")
public class HelloIBM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloIBM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		javax.servlet.http.HttpSession session = request.getSession(); 
		String sessionID = session.getId();
		String remoteUser = request.getRemoteUser();
		java.security.Principal userPrincipal = request.getUserPrincipal();
		
		String msg = null; 
		if (userPrincipal!=null) {
		    msg = "<H4>" + "You are: userPrincipal=" + userPrincipal.getName() + " sessionID=" + sessionID + "\n remoteUser=" + remoteUser + "</H4>";
		} 
		else {
			msg = "<H4>You are:  userPrincipal =" + userPrincipal + "\n </H4>";
		}
		
		PrintWriter pw = response.getWriter();
		pw.println("<BODY>");
		pw.println("<H2 >Happy to see you!</H2>");
		pw.println("<img src=\"IBMlogo.jpg\" width=300 height=300>");
		pw.println("<br>");
		pw.println("<br>");
		pw.println(msg);
		pw.println("<em>This request :</em><br>");
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			pw.print("Header Name: <em>" + headerName);
			String headerValue = request.getHeader(headerName);
			pw.print("</em>, Header Value: <em>" + headerValue);
			pw.println("</em><br/>");
		}

		pw.println("</BODY>");


		/*
		try {
			Class.forName("com.ibm.websphere.security.web.WebSecurityHelper") ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			StringBuffer sb = new StringBuffer("---DEBUG: ClassNotFoundException received---");
			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
            e.printStackTrace(new java.io.PrintStream(baos));
            sb.append("\n");
            sb.append(baos);
            sb.append("--------END Dump stack ---------");
            pw.println(sb.toString());
		} 
		*/
		
		pw.println("<a href=\"logout.jsp\">Click here to log out</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
