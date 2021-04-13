package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    @OneToOne(targetEntity = Adress.class)
    private Adress adress;
    @OneToMany(targetEntity = Orders.class)
    private List<Orders> ordersList;

    public Customer() {}

    public Customer(String firstname, String lastname, String phone, String email, Adress adress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
    }


    public List<Orders> getOrderList() {
        return ordersList;
    }

    public void setOrderList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
