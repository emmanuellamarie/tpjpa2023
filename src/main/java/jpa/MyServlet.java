package jpa;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="test", urlPatterns = {"/myurl"})

public class MyServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest requette, HttpServletResponse reponse) throws  ServletException, IOException {

        PrintWriter p = new PrintWriter(reponse.getOutputStream());
        p.print("Hello world");
        p.flush();

    }

    @Override
    protected void doPost(HttpServletRequest reqette, HttpServletResponse response) throws ServletException, IOException{

        super.doPost(reqette,response);
    }
}
