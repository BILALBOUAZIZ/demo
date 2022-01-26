package com.example.demo.conge;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class CongeState {
    @Id
    @SequenceGenerator(
            name = "conge_state_sequence",
            sequenceName = "conge_state_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "conge_state_sequence"
    )
    public Long id;
    public LocalDate conge_attribue_debut;
    public LocalDate conge_attribue_fin;


    public CongeState(Long id, LocalDate conge_attribue_debut, LocalDate conge_attribue_fin) {
        this.id = id;
        this.conge_attribue_debut = conge_attribue_debut;
        this.conge_attribue_fin = conge_attribue_fin;
    }

    public CongeState() {
    }

    public CongeState(LocalDate conge_attribue_debut, LocalDate conge_attribue_fin) {
        this.conge_attribue_debut = conge_attribue_debut;
        this.conge_attribue_fin = conge_attribue_fin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getConge_attribue_debut() {
        return conge_attribue_debut;
    }

    public void setConge_attribue_debut(LocalDate conge_attribue_debut) {
        this.conge_attribue_debut = conge_attribue_debut;
    }

    public LocalDate getConge_attribue_fin() {
        return conge_attribue_fin;
    }

    public void setConge_attribue_fin(LocalDate conge_attribue_fin) {
        this.conge_attribue_fin = conge_attribue_fin;
    }

    @Override
    public String toString() {
        return "CongeState{" +
                "conge_attribue_debut=" + conge_attribue_debut +
                ", conge_attribue_fin=" + conge_attribue_fin +
                '}';
    }
}
