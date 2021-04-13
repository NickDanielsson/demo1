package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String password;
    @OneToOne(targetEntity = Customer.class)
    private Customer customer;
}
