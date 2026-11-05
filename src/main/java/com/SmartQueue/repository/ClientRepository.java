package com.SmartQueue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartQueue.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}