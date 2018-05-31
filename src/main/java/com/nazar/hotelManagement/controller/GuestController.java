package com.nazar.hotelManagement.controller;

import com.nazar.hotelManagement.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestController guestController;

}
