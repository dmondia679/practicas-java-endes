import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SumaAcumulativaServlet
 */
public class SumaAcumulativaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumaAcumulativaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("numero");
		int sumaAcumulativa = 0;
		
		try {
			
			Integer n_int = Integer.parseInt(n);
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");

			for (int i=1;i<=n_int;i++) {
			
			sumaAcumulativa=sumaAcumulativa+i;
			
				
			}
			out.print("<h1>" + sumaAcumulativa + "</h1>");
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
