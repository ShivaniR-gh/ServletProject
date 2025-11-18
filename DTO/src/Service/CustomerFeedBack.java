package Service;

import dto.CustomerFeedbackDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/feedback" , loadOnStartup = 1)
public class CustomerFeedBack extends HttpServlet {
    public CustomerFeedBack(){
        System.out.println("Customer Object created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/Html");
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");
        String email =  req.getParameter("email");
        String comments = req.getParameter("comments");
        String rating = req.getParameter("rating");

        req.setAttribute("name",name);
        req.setAttribute("email",email);
        req.setAttribute("comments",comments);
        req.setAttribute("rating",rating);

        CustomerFeedbackDTO customerFeedBackDTO = new CustomerFeedbackDTO(name,email,comments,Integer.parseInt(rating));
        System.out.println(customerFeedBackDTO.toString());
        req.getRequestDispatcher("CustomerFeedBackResult.jsp").forward(req, resp);

    }
}
