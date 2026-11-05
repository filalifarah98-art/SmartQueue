package com.SmartQueue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.SmartQueue.entity.Service;
import com.SmartQueue.service.ServiceService;

@RestController
@RequestMapping("/api/services")
@CrossOrigin("*")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping
    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public Service getServiceById(@PathVariable("id") Long id) {
        return serviceService.getServiceById(id);
    }

    @PostMapping
    public Service createService(@RequestBody Service service) {
        return serviceService.saveService(service);
    }

    @PutMapping("/{id}")
    public Service updateService(@PathVariable("id") Long id,
                                 @RequestBody Service service) {
        service.setId(id);
        return serviceService.saveService(service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable("id") Long id) {
        serviceService.deleteService(id);
    }
}