package Service;

import dto.CafeteriaDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria")
public class CafeteriaServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String type = req.getParameter("type");
        String price = req.getParameter("price");      // read as String first
        String franchise = req.getParameter("franchise");
        String owner = req.getParameter("owner");
        String gst = req.getParameter("gst");

        req.setAttribute("name", name);
        req.setAttribute("location", location);
        req.setAttribute("type", type);
        req.setAttribute("price", price);
        req.setAttribute("franchise", franchise);
        req.setAttribute("owner", owner);
        req.setAttribute("gst", gst);

        CafeteriaDTO cafeteriaDTO = new CafeteriaDTO(name , location, type, price, franchise, owner, gst );
        System.out.println(cafeteriaDTO.toString());
        req.getRequestDispatcher("CafeteriaResult.jsp").forward(req, resp);

    }
}
