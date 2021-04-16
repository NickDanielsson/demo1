
package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne(targetEntity = Orders.class)
    private Orders orders;
    @ManyToOne(targetEntity = Product.class)
    private Product product;
    private int quantity;

}

