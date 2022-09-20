package dev.PavelEA.tomcat01.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PageServlet", value = "/page")
public class PageServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        AnswerConstructor.createAnswers();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String storyTwo = PageConstructor.getPage(2);
        String answer1 = AnswerConstructor.getAnswer(1);
        String answer2 = AnswerConstructor.getAnswer(2);



        getServletContext()
                .getRequestDispatcher("/pageHistory.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");


        response.sendRedirect("page");
    }

    }

