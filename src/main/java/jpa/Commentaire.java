package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Commentaire {

    private int id;
    private String titre;
    private String body;
    private Date dateCommentaire;
    private Utilisateur utilisateur;
    private Ticket ticket;

    public Commentaire(String titre,Ticket ticket,Utilisateur utilisateur) {
        this.titre = titre;
        this.utilisateur = utilisateur;
        this.ticket = ticket;
    }

    public Commentaire(){}

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(Date dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    @ManyToOne
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @ManyToOne
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
