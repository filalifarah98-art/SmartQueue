package com.SmartQueue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SmartQueue.entity.Queue;
import com.SmartQueue.repository.QueueRepository;

@Service
public class QueueService {

    private final QueueRepository queueRepository;

    public QueueService(QueueRepository queueRepository) {
        this.queueRepository = queueRepository;
    }

    // Afficher toutes les files d'attente
    public List<Queue> getAllQueues() {
        return queueRepository.findAll();
    }

    // Afficher une file par ID
    public Queue getQueueById(Long id) {
        return queueRepository.findById(id).orElse(null);
    }

    // Ajouter ou modifier une file
    public Queue saveQueue(Queue queue) {
        return queueRepository.save(queue);
    }

    // Supprimer une file
    public void deleteQueue(Long id) {
        queueRepository.deleteById(id);
    }

    // Rechercher les files par statut
    public List<Queue> getQueuesByStatut(String statut) {
        return queueRepository.findByStatut(statut);
    }
}