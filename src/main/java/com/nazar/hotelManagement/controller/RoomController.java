package com.nazar.hotelManagement.controller;

import com.nazar.hotelManagement.domain.Room;
import com.nazar.hotelManagement.exception.ApplicationException;
import com.nazar.hotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Room add(@RequestBody Room room) throws ApplicationException {
        return roomService.add(room);
    }
}
