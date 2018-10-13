package com.queuerite1.demo.service;

import com.queuerite1.demo.DO.serviceWaiting;
import com.queuerite1.demo.repos.serviceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service
public class ServiceExecImpl implements ServiceExec {

    private final serviceRepository servRepo;

    public ServiceExecImpl(serviceRepository servRepo) {
        this.servRepo = servRepo;
    }

    @Override
    public Page<com.queuerite1.demo.entities.Service> fetchAll(Pageable pageable) {
        return servRepo.findAll(pageable);
    }

    @Override
    public Page<serviceWaiting> fetchWaitingTimeForStations(Pageable pageable) {
        return servRepo.getAvgWaitingTimeForStations(pageable);
    }
}
