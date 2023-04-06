package com.company.Avto.model;


import jakarta.persistence.*;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "rusumi")
    private String rusumi;

    @Column (name = "brend")
    private  String brend;

    @Column (name = "rangi")
    private  String rangi;

    @Column (name = "kuzuf_nomeri")
    private  String kuzuf_nomeri;


}
