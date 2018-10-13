package com.queuerite1.demo.DO.reports;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ServiceReports {

    List<ServiceReportsServTime> serviceTime;
    List<ServiceReportWaitingTime> waitingTime;

    public ServiceReports() {
    }
    public ServiceReports(List<ServiceReportsServTime> serviceTime, List<ServiceReportWaitingTime> waitingTime) {
        this.serviceTime = serviceTime;
        this.waitingTime = waitingTime;
    }
}
