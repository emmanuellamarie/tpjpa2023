package jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sujet {

    private int id;
    private String libelle;

    private List<Ticket> ticketList = new ArrayList<Ticket>();

    public Sujet(String libelle) {
        this.libelle = libelle;
    }

    public Sujet(){}

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @OneToMany(mappedBy = "sujet", cascade = CascadeType.PERSIST)
    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}
