package Service;

import dto.CoffeeLandDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/coffeeLand" , loadOnStartup = 1)
public class CoffeeLand extends HttpServlet {
    public CoffeeLand(){
        System.out.println("Object created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        String acre = req.getParameter("acre");
        String plants = req.getParameter("plants");
        String yields = req.getParameter("yields");
        String expenditure = req.getParameter("expenditure");
        String profit = req.getParameter("profitmade");
        String fertilizers = req.getParameter("fertilizer");

        int totalPlants = Integer.parseInt(plants);
        int yield = Integer.parseInt(yields);
        double expenditures = Double.parseDouble(expenditure);
        int fr = Integer.parseInt(fertilizers);

        CoffeeLandDTO coffeeLandDTO = new CoffeeLandDTO(acre, totalPlants, yield, expenditures, profit, fr);
        System.out.println(coffeeLandDTO);

        // Set attributes for JSP
        req.setAttribute("acre", acre);
        req.setAttribute("plants", totalPlants);
        req.setAttribute("yields", yield);
        req.setAttribute("expenditure", expenditures);
        req.setAttribute("profit", profit);
        req.setAttribute("fertilizer", fr);



        req.getRequestDispatcher("CoffeeLandResult.jsp").forward(req,resp);
    }
}
