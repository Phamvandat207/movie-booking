package com.ifi.moviebooking.service;

import com.ifi.moviebooking.entity.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    List<Ticket> getAllTickets();

    Optional<Ticket> getTicketById(Long ticketId);

    Ticket pushTicket(Ticket ticket);

    void deleteTicket(Ticket ticket);
}
