package com.SmartQueue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SmartQueue.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}