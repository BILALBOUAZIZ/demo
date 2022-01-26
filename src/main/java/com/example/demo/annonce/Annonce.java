package com.example.demo.annonce;

import javax.persistence.*;

@Entity
@Table
public class Annonce {
    @Id
    @SequenceGenerator(
            name = "annonce_sequence",
            sequenceName = "annonce_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "annonce_sequence"
    )

    public Long id;
    public String annonce;

    public Annonce(Long id, String annonce) {
        this.id = id;
        this.annonce = annonce;
    }
    @Override
    public String toString() {
        return "Annonce{" +
                "annonce='" + annonce + '\'' +
                '}';
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnonce() {
        return annonce;
    }

    public void setAnnonce(String annonce) {
        this.annonce = annonce;
    }

    public Annonce() {
    }

    public Annonce(String annonce) {
        this.annonce = annonce;
    }
}
