package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@WebServlet(name="ticket", urlPatterns = {"/ticket"})
public class ServletTicket extends HttpServlet {

    EntityManager manager = EntityManagerHelper.getEntityManager();
    EntityTransaction tx = manager.getTransaction();


    @Override
    protected void doGet(HttpServletRequest requette, HttpServletResponse reponse) throws
            ServletException, IOException {

        List<Ticket> ticketList ;

         ticketList= manager.createQuery("select t from Ticket as t ", Ticket.class).getResultList();
        PrintWriter p = new PrintWriter(reponse.getOutputStream());
        p.print("les tickets crees sont:");
        p.print(ticketList.size());


        Iterator itTicket = ticketList.iterator();
        //System.out.println();
        while (itTicket.hasNext()){
            Ticket ticket = (Ticket) itTicket.next();
            p.print("sujet : "+ticket.getSujet().getLibelle()+ "titre : "+ticket.getTitre()+"" +
                            "statut : "+ticket.getStatut()
                    );

        }
        p.flush();

    }
}
