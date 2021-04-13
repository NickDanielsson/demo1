
package com.example.demo.models;

import org.hibernate.service.spi.InjectService;

import javax.management.Attribute;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToOne(targetEntity = Customer.class)
    private Customer customer;
    private Timestamp timestamp;
    private Boolean orderComplete;

    public Orders(){}

    public Orders(Customer customer, Timestamp timestamp, Boolean orderComplete) {
        this.customer = customer;
        this.timestamp = timestamp;
        this.orderComplete = orderComplete;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(Boolean orderComplete) {
        this.orderComplete = orderComplete;
    }
}

