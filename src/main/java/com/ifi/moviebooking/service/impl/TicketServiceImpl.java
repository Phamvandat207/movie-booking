package com.ifi.moviebooking.service.impl;

import com.ifi.moviebooking.entity.Ticket;
import com.ifi.moviebooking.repository.TicketRepository;
import com.ifi.moviebooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId);
    }

    @Override
    public Ticket pushTicket(Ticket newTicket) {
        return ticketRepository.save(newTicket);
    }

    @Override
    public void deleteTicket(Ticket ticket) {
        ticketRepository.delete(ticket);
    }
}
