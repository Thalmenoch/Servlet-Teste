package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Carro;

/**
 * Servlet implementation class InfoCarro
 */
public class InfoCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoCarro() {
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
		//Carro c = new Carro();
		
		String nomeMarca = request.getParameter("marca");
		String nomeModelo = request.getParameter("modelo");
		String numAno = request.getParameter("ano");
		
		PrintWriter out = response.getWriter();
		
		if(!nomeMarca.equals("") && !nomeModelo.equals("") && !numAno.equals("")) {
			
			request.getSession().setAttribute("marca", nomeMarca);
			request.getSession().setAttribute("modelo", nomeModelo);
			request.getSession().setAttribute("ano", numAno);
			response.sendRedirect("email.jsp");
			
		}else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("formulario.html");
			dispatcher.forward(request, response);
		}
	}	
}
