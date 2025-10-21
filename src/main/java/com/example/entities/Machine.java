package com.example.entities;


import javax.persistence.*;
import java.util.Date;



@Entity
@NamedNativeQuery(name = "findBetweenDateNative", query = "select * from machine where dateAchat between :d1 and :d2", resultClass = Machine.class)
@NamedQuery(name = "findBetweenDate", query = "from Machine where dateAchat between :d1 and :d2")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @ManyToOne
    private Salle salle;

    public Machine(String m123, Date date, Salle byId) {
        ref = m123;
    }

    public Machine() {

    }

    public boolean getRef() {
        return ref != null;
    }

    public Object getDateAchat() {
        return dateAchat;
    }

    public void setRef(String s) {
        ref = s;
    }

    public void setDateAchat(Date date) {
        dateAchat = date;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public int getId() {
        return id;
    }

    // Constructeurs, getters et setters
}


