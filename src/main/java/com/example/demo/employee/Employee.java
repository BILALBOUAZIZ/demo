package com.example.demo.employee;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table
public class Employee implements Serializable {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String adress;
    private String department;
    private  String job_title;

    private int salary;
    private LocalDate hiring_date;
    private String imageurl;


    public LocalDate conge_debut;
    public LocalDate conge_fin;

    public String annonce;

    public Employee() {
    }

    public Employee(long id,
                    String first_name,
                    String last_name,
                    String email,
                    String phone,
                    String adress,
                    String department,
                    String job_title,
                    int salary,
                    LocalDate hiring_date,
                    String imageurl,
                    LocalDate conge_debut,
                    LocalDate conge_fin,
                    String annonce) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.department = department;
        this.job_title = job_title;
        this.salary = salary;
        this.hiring_date = hiring_date;
        this.imageurl=imageurl;
        this.conge_debut=conge_debut;
        this.conge_fin=conge_fin;
        this.annonce=annonce;
    }

    public Employee(String first_name,
                    String last_name,
                    String email,
                    String phone,
                    String adress,
                    String department,
                    String job_title,
                    int salary,
                    LocalDate hiring_date,
                    String imageurl,
                    LocalDate conge_fin,
                    LocalDate conge_debut,
                    String annonce) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.department = department;
        this.job_title = job_title;
        this.salary = salary;
        this.hiring_date = hiring_date;
        this.imageurl=imageurl;
        this.conge_fin=conge_fin;
        this.conge_debut=conge_debut;
        this.annonce=annonce;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHiring_date() {
        return hiring_date;
    }

    public void setHiring_date(LocalDate hiring_date) {
        this.hiring_date = hiring_date;
    }
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
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

    public String getAnnonce() {
        return annonce;
    }

    public void setAnnonce(String annonce) {
        this.annonce = annonce;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", adress='" + adress + '\'' +
                ", department='" + department + '\'' +
                ", job_title='" + job_title + '\'' +
                ", salary=" + salary +
                ", hiring_date=" + hiring_date +
                ", imageurl=" + imageurl+
                '}';
    }
}
