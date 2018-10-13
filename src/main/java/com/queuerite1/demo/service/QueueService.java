package com.queuerite1.demo.service;

import com.queuerite1.demo.DO.QData;
import com.queuerite1.demo.DO.quickBranchData;
import com.queuerite1.demo.DO.quickStatsDetails;
import com.queuerite1.demo.entities.Queue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QueueService {
    Page<Queue> fetchAll(Pageable pageable);
    Page<QData> data(Pageable pageable);
    Page<quickBranchData> quickStats(Pageable pageable);
    String coName();
    List<quickStatsDetails> quickStatsDetails(Pageable pageable);
}
