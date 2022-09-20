package dev.PavelEA.tomcat01.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "PrologueServlet",value = "/prologue")
public class PrologueServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        PageConstructor.createPages();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("prologue", PageConstructor.getPage(1));
        getServletContext()
                .getRequestDispatcher("/prologue.jsp")
                .forward(request, response);
    }
}
