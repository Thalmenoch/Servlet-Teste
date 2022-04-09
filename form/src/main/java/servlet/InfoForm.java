package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoForm
 */
@WebServlet("/InfoForm")
public class InfoForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomeDest = request.getParameter("dest");
		String nomeAss = request.getParameter("ass");
		String nomeMsg = request.getParameter("msg");
		
		PrintWriter out = response.getWriter();
		
		if(!nomeDest.equals("") && !nomeAss.equals("") && !nomeMsg.equals("")) {
			request.getSession().setAttribute(nomeDest, "dest");
			request.getSession().setAttribute(nomeAss, "ass");
			request.getSession().setAttribute(nomeMsg, "msg");
			response.sendRedirect("email.jsp");
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("form.html");
			dispatcher.forward(request, response);
		}
	}

}
