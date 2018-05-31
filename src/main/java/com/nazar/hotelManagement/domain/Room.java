package com.nazar.hotelManagement.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;

    @NotNull
    private long roomNumber;

    @NotNull
    private String type;

    @NotNull
    private double rent;

    @OneToMany(mappedBy = "guestId")
    private Set<Guest> guest;

    @NotNull
    private boolean isAvailable;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Set<Guest> getGuest() {
        return guest;
    }

    public void setGuest(Set<Guest> guest) {
        this.guest = guest;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
