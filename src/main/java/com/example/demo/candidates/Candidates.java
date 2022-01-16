package com.example.demo.candidates;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class Candidates {
    private int id;
    private String first_name;
    private String last_name;
    private Date birthdate;
    private String mail;
    private int phone;
    private String adress;
    public MultipartFile c;

    public Candidates() {
    }

    public Candidates(int id,
                      String first_name,
                      String last_name,
                      Date birthdate,
                      String mail,
                      int phone,
                      String adress) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthdate = birthdate;
        this.mail = mail;
        this.phone = phone;
        this.adress = adress;
    }
}
