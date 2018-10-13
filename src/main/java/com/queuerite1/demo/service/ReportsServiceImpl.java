package com.queuerite1.demo.service;

import com.queuerite1.demo.DO.reports.*;
import com.queuerite1.demo.repos.reportsRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReportsServiceImpl implements ReportsService {
    private final reportsRepo repo;

    public ReportsServiceImpl(reportsRepo repo) {
        this.repo = repo;
    }

    @Override
    public Page<indivualServiceBreakdown> getIndiviualServiceBreakDown(
            Date startDate, Date endDate, Pageable pageable) {
        return repo.getIndiviualServiceBreakdown(startDate,endDate,pageable);
    }

    @Override
    public List<BranchSummaryServiceTime> fetchBranchSummaryServiceTime(Date startDate, Date endDate) {
        return repo.fetchBranchServiceSummary(startDate, endDate);
    }

    @Override
    public List<BranchSummaryWaitingTime> fetchBranchWaitingServiceTime(Date startDate, Date endDate) {
        return repo.fetchBranchWaitingSummary(startDate, endDate);
    }

    @Override
    public Long noOfCustomers(Date startDate, Date endDate) {
        List<BranchSummaryNoOfCust> data =repo.fetchTotalCustomers(startDate, endDate);
        return data.get(0).getNoOfCustomers();
    }
    @Override
    public List<BranchSummary> fetchBranchLevelSummary(Date startDate, Date endDate){
        BranchSummary summary = new BranchSummary();
        List<BranchSummary> data = new ArrayList<>();
        summary.setNoOfCustomers(noOfCustomers(startDate, endDate));
       // summary.setNoOfCustomers();
        summary.setServiceTime(fetchBranchSummaryServiceTime(startDate, endDate));
        summary.setWaitingTime(fetchBranchWaitingServiceTime(startDate, endDate));
        data.add(summary);
        return data;
    }

    @Override
    public List<ServiceReportsServTime> fetchServiceReportServTime(Date startDate, Date endDate) {
        return repo.fetchServiceReportServTime(startDate, endDate);
    }
    @Override
    public List<ServiceReportWaitingTime> fetchServiceReportWaitingTime(Date startDate, Date endDate) {
        return repo.fetchServiceReportWaitingTime(startDate, endDate);
    }

    @Override
    public List<ServiceReports> ServiceReports(Date startDate, Date endDate) {
        ServiceReports reports = new ServiceReports();
        reports.setServiceTime(fetchServiceReportServTime(startDate, endDate));
        reports.setWaitingTime(fetchServiceReportWaitingTime(startDate, endDate));

        List<ServiceReports> data = new ArrayList<>();
        data.add(reports);
        return data;
    }

    @Override
    public List<IndividualPerfomance> fetchIndiviualPerfomanceReports(Date startDate, Date endDate) {
        return repo.fetchIndiviualPerfomance(startDate, endDate);
    }


}
