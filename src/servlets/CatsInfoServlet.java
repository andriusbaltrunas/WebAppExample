package servlets;

import vo.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 4/18/2017.
 */

@WebServlet(value = "/catsInfo")
public class CatsInfoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Pukis", "Persas", 8, 8.4, false);
        cats.add(cat);
        Cat cat1 = new Cat("Grafke", "Skotu nuliapausis", 1, 3, false);
        cats.add(cat1);

        req.setAttribute("cats", cats);
        req.getRequestDispatcher("catsInfo.jsp").forward(req, resp);
    }
}
