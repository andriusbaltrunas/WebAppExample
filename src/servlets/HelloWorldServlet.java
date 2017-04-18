package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 4/18/2017.
 */

@WebServlet(value = "/helloWorld")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String text = "Dar karteli labas";
        req.setAttribute("vardasLocalus", text);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

        // taip niekas tikrai nebedaro
       // resp.getWriter().println("Labukas :(");

    }
}
