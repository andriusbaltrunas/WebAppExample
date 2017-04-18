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

@WebServlet(value = "/createCat")
public class CreateCatServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("catName");
        String catKind = req.getParameter("catKind");
        int catAge = Integer.parseInt(req.getParameter("catAge"));
        double catWeight = Double.parseDouble(req.getParameter("catWeight"));
        boolean isItLikeMilk = Boolean.getBoolean(req.getParameter("isLikeMik"));

        Cat cat = new Cat(catName, catKind, catAge, catWeight, isItLikeMilk);
        req.setAttribute("cat", cat);
        req.getRequestDispatcher("catInfo.jsp").forward(req, resp);
    }
}
