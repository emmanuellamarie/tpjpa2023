package jpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Ticket {

    private int id;
    private String titre;
    private String body;
    private String statut;
    private Date dateCreation;
    private Date dateResolution;
    private Date dateAttribution;

    private Sujet sujet;

    private UtilisateurStandard utilisateurStandard;
    private UtilisateurSupport utilisateurSupport;


    public Ticket(String titre, Sujet sujet, UtilisateurStandard utilisateurStandard) {
        this.titre = titre;
        this.statut = "création";
        this.sujet = sujet;
        this.utilisateurStandard = utilisateurStandard;
    }

    public Ticket(){

    }

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

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateResolution() {
        return dateResolution;
    }

    public void setDateResolution(Date dateResolution) {
        this.dateResolution = dateResolution;
    }

    public Date getDateAttribution() {
        return dateAttribution;
    }

    public void setDateAttribution(Date dateAttribution) {
        this.dateAttribution = dateAttribution;
    }

    @ManyToOne
    public Sujet getSujet() {
        return sujet;
    }

    public void setSujet(Sujet sujet) {
        this.sujet = sujet;
    }

    @ManyToOne
    public UtilisateurStandard getUtilisateurStandard() {
        return utilisateurStandard;
    }

    public void setUtilisateurStandard(UtilisateurStandard utilisateurStandard) {
        this.utilisateurStandard = utilisateurStandard;
    }

    @ManyToOne
    public UtilisateurSupport getUtilisateurSupport() {
        return utilisateurSupport;
    }

    public void setUtilisateurSupport(UtilisateurSupport utilisateurSupport) {
        this.utilisateurSupport = utilisateurSupport;
    }
}
