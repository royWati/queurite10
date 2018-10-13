package com.queuerite1.demo.service;

import com.queuerite1.demo.DO.QData;
import com.queuerite1.demo.DO.quickBranchData;
import com.queuerite1.demo.DO.quickStatsDetails;
import com.queuerite1.demo.entities.Queue;
import com.queuerite1.demo.repos.QueueReposity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueueServiceImpl implements QueueService {

    private final  QueueReposity queRepo;

    public QueueServiceImpl(QueueReposity queRepo) {
        this.queRepo = queRepo;
    }

    @Override
    public Page<Queue> fetchAll(Pageable pageable) {
        return queRepo.findAll(pageable);
    }

    @Override
    public Page<QData> data(Pageable pageable){
        List<QData> d = new ArrayList<>();
                return queRepo.queuesTime(pageable);
    }

    @Override
    public Page<quickBranchData> quickStats(Pageable pageable) {
        return queRepo.fetchQuickBranchData(pageable);
    }

    @Override
    public String coName() {
        return queRepo.company_name().get(0).company_name;
    }

    @Override
    public List<quickStatsDetails> quickStatsDetails(Pageable pageable) {
        quickStatsDetails data = new quickStatsDetails();
        data.setCompanyName(coName());
        data.setDetails(quickStats(pageable));
        List<quickStatsDetails> d = new ArrayList<>();
        d.add(data);
        return d;
    }
}
