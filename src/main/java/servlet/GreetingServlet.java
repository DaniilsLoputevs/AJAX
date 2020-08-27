package servlet;

import ahelptools.ConslLog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingServlet extends HttpServlet {

    /**
     *
     * <p>
     * name : String - user email(text from input)
     * <p>
     * goto: NONE
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");

        String name = req.getParameter("name");
        String text = req.getParameter("text");

        ConslLog.log("### SPECIAL");
        ConslLog.log("name", name);
        ConslLog.log("text", text);
        ConslLog.log("### SPECIAL ###");

        PrintWriter writer = new PrintWriter(resp.getOutputStream());
//        writer.println("Nice to meet you, " + name);
        writer.println("Nice to meet you, " + text);
        writer.flush();
    }
}