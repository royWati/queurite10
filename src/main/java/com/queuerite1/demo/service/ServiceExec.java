package com.queuerite1.demo.service;

import com.queuerite1.demo.DO.serviceWaiting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceExec {

    Page<com.queuerite1.demo.entities.Service> fetchAll(Pageable pageable);
    Page<serviceWaiting> fetchWaitingTimeForStations(Pageable pageable);
}
