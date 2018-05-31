package com.nazar.hotelManagement.repository;

import com.nazar.hotelManagement.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest,Long> {
    Guest findByName(final String guest_name);
}
