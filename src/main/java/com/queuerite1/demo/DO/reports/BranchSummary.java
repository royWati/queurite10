package com.queuerite1.demo.DO.reports;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BranchSummary {

    List<BranchSummaryServiceTime> serviceTime;
    List<BranchSummaryWaitingTime> waitingTime;
    long noOfCustomers;

    public BranchSummary(List<BranchSummaryServiceTime> serviceTime, List<BranchSummaryWaitingTime> waitingTime, int noOfCustomers) {
        this.serviceTime = serviceTime;
        this.waitingTime = waitingTime;
        this.noOfCustomers = noOfCustomers;
    }

    public BranchSummary() {
    }
}
