package com.nazar.hotelManagement.service.Impl;

import com.nazar.hotelManagement.domain.Room;
import com.nazar.hotelManagement.exception.ApplicationException;
import com.nazar.hotelManagement.exception.DuplicateDomainException;
import com.nazar.hotelManagement.exception.NoDomainFoundException;
import com.nazar.hotelManagement.repository.RoomRepository;
import com.nazar.hotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room add(Room room) throws ApplicationException {

        verifyRoom(room);
        checkDuplicateRoom(room);
        return roomRepository.saveAndFlush(room);
    }

    @Override
    public Room update(Room room) throws ApplicationException {

        verifyRoom(room);
        Room roomToUpdate = roomRepository.findById(room.getRoomId()).get();
        if(room.getRoomNumber() == roomToUpdate.getRoomNumber()){
            throw new DuplicateDomainException(String.format("Room No: '%s' already exists.",room.getRoomNumber()));
        }
        return roomRepository.saveAndFlush(room);
    }

    @Override
    public void remove(Room room) throws ApplicationException {

    }

    @Override
    public Room findById(long id) throws ApplicationException {

        Room room = roomRepository.findById(id).get();
        verifyRoom(room);

        return room;
    }

    @Override
    public Room findByRoomNumber(long number) throws ApplicationException {

        Room room = roomRepository.findByRoomNumber(number);
        verifyRoom(room);

        return room;
    }

    private void verifyRoom(final Room room) throws NoDomainFoundException {

        if(room == null){
            throw new NoDomainFoundException("Please Provide Valid Information");
        }
    }

    private void checkDuplicateRoom(final Room room) throws ApplicationException {

        if(findByRoomNumber(room.getRoomNumber()) != null){
            throw new DuplicateDomainException("Duplicate Room Number Found");
        }
    }
}
