
package com.SmartQueue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.SmartQueue.entity.Agent;
import com.SmartQueue.service.AgentService;

@RestController
@RequestMapping("/api/agents")
@CrossOrigin("*")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    // Afficher tous les agents
    @GetMapping
    public List<Agent> getAllAgents() {
        return agentService.getAllAgents();
    }

    // Afficher un agent par ID
    @GetMapping("/{id}")
    public Agent getAgentById(@PathVariable Long id) {
        return agentService.getAgentById(id);
    }

    // Ajouter un agent
    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {
        return agentService.saveAgent(agent);
    }

    // Modifier un agent
    @PutMapping("/{id}")
    public Agent updateAgent(@PathVariable Long id,
                             @RequestBody Agent agent) {
        agent.setId(id);
        return agentService.saveAgent(agent);
    }

    // Supprimer un agent
    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable Long id) {
        agentService.deleteAgent(id);
    }
}
