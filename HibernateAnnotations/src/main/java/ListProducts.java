

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.jaxb.cfg.spi.JaxbCfgHibernateConfiguration.JaxbCfgSessionFactory;

import com.ecommerce.HibernateUtil;

/**
 * Servlet implementation class ListProducts
 * @param <EProduct>
 */
@WebServlet("/ListProducts")
public class ListProducts<EProduct> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  try {
              JaxbCfgSessionFactory factory = HibernateUtil.getSessionFactory();
              
              Session session = factory.openSession();
              // using HQL
              List<EProduct> list = session.createQuery("from EProduct").list();
              
              session.close();
              
               PrintWriter out = response.getWriter();
               out.println("<html><body>");
               out.println("<b>Product Listing</b><br>");
               for(EProduct p: list) {
                       out.println("ID: " + String.valueOf((p).getID()) + ", Name: " + p.getName() +
                                       ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString() + "<br>");
               }
               
           out.println("</body></html>");
           
           
       } catch (Exception ex) {
               throw ex;
       }
          
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
