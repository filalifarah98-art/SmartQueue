
package com.SmartQueue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.SmartQueue.entity.Client;
import com.SmartQueue.service.ClientService;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin("*")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Afficher tous les clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // Afficher un client par ID
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // Ajouter un client avec validation
    @PostMapping
    public Client createClient(@Valid @RequestBody Client client) {
        return clientService.saveClient(client);
    }

    // Modifier un client avec validation
    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id,
                               @Valid @RequestBody Client client) {
        client.setId(id);
        return clientService.saveClient(client);
    }

    // Supprimer un client
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
