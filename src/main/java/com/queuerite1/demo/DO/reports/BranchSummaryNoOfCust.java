package com.queuerite1.demo.DO.reports;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchSummaryNoOfCust {

    private Long noOfCustomers;

    public BranchSummaryNoOfCust(Long noOfCustomers) {
        this.noOfCustomers = noOfCustomers;
    }

    public BranchSummaryNoOfCust() {
    }
}
