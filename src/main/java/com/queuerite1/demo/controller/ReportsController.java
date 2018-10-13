package com.queuerite1.demo.controller;

import com.queuerite1.demo.DO.reports.*;
import com.queuerite1.demo.service.ReportsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportsController {
    private final ReportsService service;

    public ReportsController(ReportsService service) {
        this.service = service;
    }

    @GetMapping("/indivual-service-breakdown")
    public Page<indivualServiceBreakdown> fetchServiceData(@RequestParam("start")String start,
                                                           @RequestParam("end")String end,
                                                           Pageable pageable) throws ParseException {
       Date s_date =  new SimpleDateFormat("yyyy-MM-dd").parse(start);
       Date e_date =  new SimpleDateFormat("yyyy-MM-dd").parse(end);
       System.out.println("start date :"+s_date);
       System.out.println("end date :"+e_date);
        return service.getIndiviualServiceBreakDown(s_date,e_date,pageable);
    }

    @GetMapping("/branch-level-summary")
    public List<BranchSummary> fetchSummary(@RequestParam("start")String start,
                                            @RequestParam("end")String end
                                            ) throws ParseException {
        Date s_date =  new SimpleDateFormat("yyyy-MM-dd").parse(start);
        Date e_date =  new SimpleDateFormat("yyyy-MM-dd").parse(end);
        return service.fetchBranchLevelSummary(s_date,e_date);
    }

    @GetMapping("/service-reports")
    public List<ServiceReports> getServiceReports(@RequestParam("start") String startDate,
                                                  @RequestParam("end")String endDate) throws ParseException {
        Date s_date =  new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        Date e_date =  new SimpleDateFormat("yyyy-MM-dd").parse(endDate);

        System.out.println("date from "+s_date);
        System.out.println("date to "+e_date);
        return service.ServiceReports(s_date,e_date);
    }

    @GetMapping("/indvidual-performance")
    public List<IndividualPerfomance> getIndiviualPerfomanceReports(@RequestParam("start") String startDate,
                                                                    @RequestParam("end")String endDate) throws ParseException {
        Date s_date =  new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        Date e_date =  new SimpleDateFormat("yyyy-MM-dd").parse(endDate);

        return service.fetchIndiviualPerfomanceReports(s_date,e_date);
    }
}
