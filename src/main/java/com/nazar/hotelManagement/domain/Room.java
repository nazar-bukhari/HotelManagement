package com.nazar.hotelManagement.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    private long number;

    @NotNull
    private String type;

    @NotNull
    private double fair;

    @OneToMany
    private Guest guest;

    @NotNull
    private boolean isAvailable;
}
