package com.nazar.hotelManagement.service;

import com.nazar.hotelManagement.domain.Guest;
import com.nazar.hotelManagement.exception.ApplicationException;

public interface GuestService {
    Guest add(final Guest guest) throws ApplicationException;
    Guest update(final Guest guest) throws ApplicationException;
    void remove(final Guest guest) throws ApplicationException;
    Guest findById(final long id) throws ApplicationException;
    Guest findByName(final String name) throws ApplicationException;
}
