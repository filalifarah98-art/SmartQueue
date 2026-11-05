
package com.SmartQueue.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartQueue.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // 1. Rechercher les tickets par statut
    List<Ticket> findByStatut(String statut);

    // 2. Rechercher les tickets par client
    List<Ticket> findByClientId(Long clientId);

}
