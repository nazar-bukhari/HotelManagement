package com.nazar.hotelManagement.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long guestId;

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
//    @JoinColumn(name = "room_id") //@Joincolumn is needed if different column rather than id is used for foreign key
    private Room room;

    @Temporal(TemporalType.TIMESTAMP)
    private Date checkIn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date checkOut;


    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
