package servlets;

import vo.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 4/18/2017.
 */

@WebServlet(value = "/catInfo")
public class CatInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cat cat = new Cat("Pukis", "Persas", 8, 8.4, false);
        req.setAttribute("cat", cat);
        req.getRequestDispatcher("catInfo.jsp").forward(req, resp);
    }
}
