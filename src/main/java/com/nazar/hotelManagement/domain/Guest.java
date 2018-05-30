package com.nazar.hotelManagement.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    private String name;

    @NotNull
    @Pattern(regexp = "^[0-9]")
    private String mobileNumber;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9]]")
    private String address;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Room roomNumber;

    @Temporal(TemporalType.TIMESTAMP)
    private Date checkIn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date checkOut;


}
