package dev.PavelEA.tomcat01.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "SettingsServlet",value = "/settings")
public class SettingsServlet extends HttpServlet {
    private UserRepository userRepository = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        HttpSession session = request.getSession();
        User user;
        if (userRepository.isExists(username)){
            user = userRepository.fetchByUsername(username);
            user.setAttempts(user.getAttempts()+1);
            session.setAttribute("attempts",user.getAttempts());
        } else {
            user = new User();
            user.setAttempts(1);
            user.setUsername(username);
            userRepository.save(user);
        }
        response.sendRedirect("settingsGame.jsp");
    }

}
