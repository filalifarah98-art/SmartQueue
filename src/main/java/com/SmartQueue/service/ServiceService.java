package com.SmartQueue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SmartQueue.repository.ServiceRepository;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<com.SmartQueue.entity.Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public com.SmartQueue.entity.Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public com.SmartQueue.entity.Service saveService(com.SmartQueue.entity.Service service) {
        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}