package com.ifi.moviebooking.repository;

import com.ifi.moviebooking.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
