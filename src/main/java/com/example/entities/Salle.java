package com.example.entities;



import javax.persistence.*;
import java.util.List;

// Salle.java
@Entity
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines;

    public Salle(String a101) {
        this.code = a101;
    }

    public Salle() {

    }

    public String getCode() {
        return code;
    }

    public Machine[] getMachines() {
        return machines.toArray(new Machine[machines.size()]);
    }

    public void setCode(String a101) {
        this.code = a101;
    }

    public int getId() {
        return id;
    }

    // Constructeurs, getters et setters
}