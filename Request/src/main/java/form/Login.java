package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/formlogin", "/email"})

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
	
	//tem algo de errado aqui
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomeUsuario = request.getParameter("usuario");

		String senhaUsuario = request.getParameter("senha");

		PrintWriter out = response.getWriter();

		if (nomeUsuario.equals("admin") && senhaUsuario.equals("123"))

			{
			String path2 = "/Request/email.jsp";
			request.getSession().setAttribute("usuario",nomeUsuario);
			response.sendRedirect(path2);
			} else
			{	
				String path1 = "/formlogin.html";
				RequestDispatcher dispatcher = request.getRequestDispatcher(path1);
				dispatcher.forward(request, response);

			}
		doGet(request, response);
		
		}

}
	


