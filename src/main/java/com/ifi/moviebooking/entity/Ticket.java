package com.ifi.moviebooking.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Ticket_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "ID-card")
    private  String idCard;

    @Column(name = "DoB")
    private Date DoB;

    @Column(name = "type")
    private Eticket type;

    @Column(name = "payment")
    private long payment;

}
