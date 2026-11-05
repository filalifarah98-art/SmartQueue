package com.SmartQueue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.SmartQueue.entity.Queue;
import com.SmartQueue.service.QueueService;

@RestController
@RequestMapping("/api/queues")
@CrossOrigin("*")
public class QueueController {

    private final QueueService queueService;

    public QueueController(QueueService queueService) {
        this.queueService = queueService;
    }

    // Afficher toutes les files
    @GetMapping
    public List<Queue> getAllQueues() {
        return queueService.getAllQueues();
    }

    // Afficher une file par ID
    @GetMapping("/{id}")
    public Queue getQueueById(@PathVariable Long id) {
        return queueService.getQueueById(id);
    }

    // Ajouter une file
    @PostMapping
    public Queue createQueue(@RequestBody Queue queue) {
        return queueService.saveQueue(queue);
    }

    // Modifier une file
    @PutMapping("/{id}")
    public Queue updateQueue(@PathVariable Long id, @RequestBody Queue queue) {
        queue.setId(id);
        return queueService.saveQueue(queue);
    }

    // Supprimer une file
    @DeleteMapping("/{id}")
    public void deleteQueue(@PathVariable Long id) {
        queueService.deleteQueue(id);
    }

    // Rechercher les files par statut
    @GetMapping("/statut/{statut}")
    public List<Queue> getQueuesByStatut(@PathVariable String statut) {
        return queueService.getQueuesByStatut(statut);
    }
}