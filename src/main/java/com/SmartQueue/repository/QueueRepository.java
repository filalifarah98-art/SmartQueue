
package com.SmartQueue.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartQueue.entity.Queue;

public interface QueueRepository extends JpaRepository<Queue, Long> {

    // Rechercher les files selon leur statut
    List<Queue> findByStatut(String statut);

}
