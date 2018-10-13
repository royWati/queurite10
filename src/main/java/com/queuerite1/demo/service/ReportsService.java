package com.queuerite1.demo.service;

import com.queuerite1.demo.DO.reports.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface ReportsService {
    Page<indivualServiceBreakdown> getIndiviualServiceBreakDown(
            Date startDate, Date endDate, Pageable pageable);

     List<BranchSummaryServiceTime> fetchBranchSummaryServiceTime(Date startDate, Date endDate);
     List<BranchSummaryWaitingTime> fetchBranchWaitingServiceTime(Date startDate, Date endDate);
     Long noOfCustomers(Date startDate, Date endDate);
     List<BranchSummary> fetchBranchLevelSummary(Date startDate, Date endDate);
     List<ServiceReportsServTime> fetchServiceReportServTime(Date startDate, Date endDate);
     List<ServiceReportWaitingTime> fetchServiceReportWaitingTime(Date startDate, Date endDate);
     List<ServiceReports> ServiceReports(Date startDate, Date endDate);
     List<IndividualPerfomance> fetchIndiviualPerfomanceReports(Date startDate, Date endDate);
}
