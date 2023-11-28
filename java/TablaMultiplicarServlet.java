

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TablaMultiplicarServlet
 */
public class TablaMultiplicarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TablaMultiplicarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numero = request.getParameter("numero");
		
		try {
			
			Integer numero_int = Integer.parseInt(numero);
			
				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset=\"UTF-8\">");
				out.print("</head>");
				out.print("<body>");
				
				for (int i=1;i<=10;i++) {
					
					int resultado = numero_int * i;

					out.print("<h1>" + numero_int + " x " + i + " = " + resultado + "</h1>");
					
				}
				out.print("</body>");
				out.print("</html>");
			
		}catch(Exception e) {
			System.out.println(e.toString());
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
