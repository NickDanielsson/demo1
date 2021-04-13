
package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToOne(targetEntity = Orders.class)
    private Orders orders;
    @OneToMany(targetEntity = Product.class)
    private List<Product> productList;
    private int quantity;
}

