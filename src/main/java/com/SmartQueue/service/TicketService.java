
package com.SmartQueue.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.SmartQueue.entity.Ticket;
import com.SmartQueue.repository.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    public List<Ticket> getTicketsByStatut(String statut) {
        return ticketRepository.findByStatut(statut);
    }

    public List<Ticket> getTicketsByClient(Long clientId) {
        return ticketRepository.findByClientId(clientId);
    }
}
