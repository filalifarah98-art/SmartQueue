
package com.SmartQueue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.SmartQueue.entity.Ticket;
import com.SmartQueue.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin("*")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // Afficher tous les tickets
    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    // Afficher un ticket par ID
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    // Ajouter un ticket
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }

    // Modifier un ticket
    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id,
                               @RequestBody Ticket ticket) {
        ticket.setId(id);
        return ticketService.saveTicket(ticket);
    }

    // Supprimer un ticket
    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }

    // Rechercher les tickets par statut
    @GetMapping("/statut/{statut}")
    public List<Ticket> getTicketsByStatut(@PathVariable String statut) {
        return ticketService.getTicketsByStatut(statut);
    }

    // Rechercher les tickets par client
    @GetMapping("/client/{clientId}")
    public List<Ticket> getTicketsByClient(@PathVariable Long clientId) {
        return ticketService.getTicketsByClient(clientId);
    }
}
