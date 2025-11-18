package Service;

import dto.CoffeeDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/coffee" , loadOnStartup = 1)
public class Coffee extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        resp.setContentType("Html/text");
        PrintWriter writer = resp.getWriter();

        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");
        String farmer = req.getParameter("farmer");
        String location = req.getParameter("location");

        req.setAttribute("type" , type);
        req.setAttribute("price" , price);
        req.setAttribute("quantity" , quantity);
        req.setAttribute("farmer" , farmer);
        req.setAttribute("location" , location);

        CoffeeDTO coffeeDTO = new CoffeeDTO(type,Double.parseDouble(price),Integer.parseInt(quantity),farmer,location);
        System.out.println(coffeeDTO.toString());

        req.getRequestDispatcher("CoffeeResult.jsp").forward(req,resp);

    }
}
