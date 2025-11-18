package Service;

import dto.CustomerDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns ="/customer" , loadOnStartup = 1)
public class Customer extends HttpServlet {
    public Customer(){
        System.out.println("Customer Object created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/Html");
        PrintWriter writer = resp.getWriter();

        String name =  req.getParameter("name");
        String mob = req.getParameter("mobile");
        String flavour = req.getParameter("flavour");
        String qty = req.getParameter("quantity") ;
        String pm =  req.getParameter("payment");

        req.setAttribute("name" ,name);
        req.setAttribute("mob" , mob);
        req.setAttribute("flavour" , flavour);
        req.setAttribute("qty", qty);
        req.setAttribute("pm" ,pm);

        CustomerDTO customerDTO = new CustomerDTO(name,Long.parseLong(mob),flavour, Integer.parseInt(qty),pm);
        System.out.println(customerDTO.toString());

        req.getRequestDispatcher("CustomerResult.jsp").forward(req , resp);
    }
}
