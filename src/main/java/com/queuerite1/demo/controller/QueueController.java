package com.queuerite1.demo.controller;

import com.queuerite1.demo.DO.quickBranchData;
import com.queuerite1.demo.DO.quickStatsDetails;
import com.queuerite1.demo.entities.Queue;
import com.queuerite1.demo.DO.QData;
import com.queuerite1.demo.service.QueueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/queue")
public class QueueController {

    private final QueueService queueService;
    public QueueController(QueueService queueService) {
        this.queueService = queueService;
    }

    @GetMapping("/page/{pageno}")
    public Page<Queue> fetchAll(@PathVariable("pageno") int pageno){
        return queueService.fetchAll(new PageRequest(pageno,10));
    }

    @GetMapping("/timestamps/page")
    public Page<QData> queueTimeStamps(@RequestParam("pageno") int pageno){

        return queueService.data(new PageRequest(pageno,20));
    }

    @GetMapping("/quickstats")
    public Page<quickBranchData> quickStats(Pageable pageable){
        return queueService.quickStats(pageable);
    }

    @GetMapping("/quickbranchstats")
    public List<quickStatsDetails> quickBranchStats(Pageable pageable){
        return queueService.quickStatsDetails(pageable);
    }

    @GetMapping("/company-name")
    public String companyName(){
        return queueService.coName();
    }


}
