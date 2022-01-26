package com.example.demo.conge;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class CongeDemande {
    @Id
    @SequenceGenerator(
            name = "conge_sequence",
            sequenceName = "conge_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "conge_sequence"
    )
    public Long id;
    public LocalDate conge_debut;
    public LocalDate conge_fin;


    @Override
    public String toString() {
        return "Conge{" +
                "conge_debut=" + conge_debut +
                ", conge_fin=" + conge_fin +
                '}';
    }
    public CongeDemande(Long id, LocalDate conge_debut, LocalDate conge_fin) {
        this.id = id;
        this.conge_debut = conge_debut;
        this.conge_fin = conge_fin;
    }

    public LocalDate getConge_debut() {
        return conge_debut;
    }

    public void setConge_debut(LocalDate conge_debut) {
        this.conge_debut = conge_debut;
    }

    public LocalDate getConge_fin() {
        return conge_fin;
    }

    public void setConge_fin(LocalDate conge_fin) {
        this.conge_fin = conge_fin;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CongeDemande() {
    }

    public CongeDemande(LocalDate conge_debut, LocalDate conge_fin, LocalDate conge_attribue_debut, LocalDate conge_attribue_fin) {
        this.conge_debut = conge_debut;
        this.conge_fin = conge_fin;
    }
}
