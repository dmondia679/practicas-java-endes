

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SaludoServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1 = request.getParameter("numero1");
		String n2 = request.getParameter("numero2");
		String n3 = request.getParameter("numero3");
		
		try {
			
			Integer n1_int = Integer.parseInt(n1);
			Integer n2_int = Integer.parseInt(n2);
			Integer n3_int = Integer.parseInt(n3);
			
			if (n1_int > n2_int) {
				if (n1_int > n3_int) {
					PrintWriter out = response.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("<meta charset=\"UTF-8\">");
					out.print("</head>");
					out.print("<body>");
					out.print("<h1> El mayor de los numeros es:  " + n1_int + "</h1>");
					out.print("</body>");
					out.print("</html>");
				}
				else {
					PrintWriter out = response.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("<meta charset=\"UTF-8\">");
					out.print("</head>");
					out.print("<body>");
					out.print("<h1> El mayor de los numeros es:  " + n3_int + "</h1>");
					out.print("</body>");
					out.print("</html>");
				}
			}
			else if (n2_int > n1_int) {
				if (n2_int > n3_int) {
					PrintWriter out = response.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("<meta charset=\"UTF-8\">");
					out.print("</head>");
					out.print("<body>");
					out.print("<h1> El mayor de los numeros es:  " + n2_int + "</h1>");
					out.print("</body>");
					out.print("</html>");
				}
				else {
					PrintWriter out = response.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("</head>");
					out.print("<body>");
					out.print("<h1> El mayor de los numeros es:  " + n3_int + "</h1>");
					out.print("</body>");
					out.print("</html>");
				}
			}
			
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
