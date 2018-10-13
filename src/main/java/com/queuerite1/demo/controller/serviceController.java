package com.queuerite1.demo.controller;

import com.queuerite1.demo.DO.serviceWaiting;
import com.queuerite1.demo.service.ServiceExec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class serviceController {

   private final ServiceExec getServiceExec;

    public serviceController(ServiceExec getServiceExec) {
        this.getServiceExec = getServiceExec;
    }

    @GetMapping
    public Page<com.queuerite1.demo.entities.Service> fetchAll(Pageable pageable){
        return getServiceExec.fetchAll(pageable);
    }

    @GetMapping("/AVERAGEWAITINGTIME")
    public Page<serviceWaiting> fetchWaitingTimeForStations(Pageable pageable){
        return getServiceExec.fetchWaitingTimeForStations(pageable);
    }
}
