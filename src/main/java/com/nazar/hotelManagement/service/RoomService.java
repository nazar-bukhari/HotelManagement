package com.nazar.hotelManagement.service;

import com.nazar.hotelManagement.domain.Room;
import com.nazar.hotelManagement.exception.ApplicationException;

public interface RoomService {

    Room add(final Room room) throws ApplicationException;
    Room update(final Room room) throws ApplicationException;
    void remove (final Room room) throws ApplicationException;
    Room findById(final long id) throws ApplicationException;
    Room findByRoomNumber(final long number) throws ApplicationException;
}
