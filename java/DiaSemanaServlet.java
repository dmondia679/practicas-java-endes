

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n_dia = request.getParameter("dia");
		try {
			
			Integer dia_int = Integer.parseInt(n_dia);
			
			if (dia_int < 8 && dia_int > 0) {
				
				switch(dia_int) {
				
				case 1: 
					PrintWriter out = response.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("<meta charset=\"UTF-8\">");
					out.print("</head>");
					out.print("<body>");
					out.print("<h1>Lunes</h1>");
					out.print("</body>");
					out.print("</html>");
					break;
				case 2: 
					PrintWriter out2 = response.getWriter();
					out2.print("<html>");
					out2.print("<head>");
					out2.print("<meta charset=\"UTF-8\">");
					out2.print("</head>");
					out2.print("<body>");
					out2.print("<h1>Martes</h1>");
					out2.print("</body>");
					out2.print("</html>");
					break;
				case 3: 
					PrintWriter out3 = response.getWriter();
					out3.print("<html>");
					out3.print("<head>");
					out3.print("<meta charset=\"UTF-8\">");
					out3.print("</head>");
					out3.print("<body>");
					out3.print("<h1>Miércoles</h1>");
					out3.print("</body>");
					out3.print("</html>");
					break;
				case 4: 
					PrintWriter out4 = response.getWriter();
					out4.print("<html>");
					out4.print("<head>");
					out4.print("<meta charset=\"UTF-8\">");
					out4.print("</head>");
					out4.print("<body>");
					out4.print("<h1>Jueves</h1>");
					out4.print("</body>");
					out4.print("</html>");
					break;
				case 5: 
					PrintWriter out5 = response.getWriter();
					out5.print("<html>");
					out5.print("<head>");
					out5.print("<meta charset=\"UTF-8\">");
					out5.print("</head>");
					out5.print("<body>");
					out5.print("<h1>Viernes</h1>");
					out5.print("</body>");
					out5.print("</html>");
					break;
				case 6: 
					PrintWriter out6 = response.getWriter();
					out6.print("<html>");
					out6.print("<head>");
					out6.print("<meta charset=\"UTF-8\">");
					out6.print("</head>");
					out6.print("<body>");
					out6.print("<h1>Sábado</h1>");
					out6.print("</body>");
					out6.print("</html>");
					break;
				case 7: 
					PrintWriter out7 = response.getWriter();
					out7.print("<html>");
					out7.print("<head>");
					out7.print("<meta charset=\"UTF-8\">");
					out7.print("</head>");
					out7.print("<body>");
					out7.print("<h1>Domingo</h1>");
					out7.print("</body>");
					out7.print("</html>");
					break;
		}		
				}
			
			else {
					PrintWriter out = response.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("</head>");
					out.print("<body>");
					out.print("<h1>El número es mayor de 7 o menor de 1.</h1>");
					out.print("</body>");
					out.print("</html>");
				}
			}
			
		catch(Exception e) {
			System.out.println(e.toString());
			}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
