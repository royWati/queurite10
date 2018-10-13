package com.queuerite1.demo.repos;

import com.queuerite1.demo.DO.companyName;
import com.queuerite1.demo.DO.quickBranchData;
import com.queuerite1.demo.entities.Queue;
import com.queuerite1.demo.DO.QData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface QueueReposity extends JpaRepository<Queue,Long> {

    @Query(value = "SELECT NEW com.queuerite1.demo.DO.QData(q.id,q.createdOn,q.updatedOn)" +
            " FROM Queue q")
    Page<QData> queuesTime(Pageable pageable);

    String QUICK_BRANCH_QUERY="SELECT NEW com.queuerite1.demo.DO.quickBranchData(" +
            "COUNT(q.id) as total_entries," +
            "AVG(UNIX_TIMESTAMP(q.updatedOn)-UNIX_TIMESTAMP(q.createdOn)) as avg_waiting," +
            "sg.name) " +
            "  FROM Queue q " +
            "INNER JOIN Service s ON q.serviceId=s.id" +
            " INNER JOIN ServiceGroup sg ON s.serviceGroup=sg.id" +
            " GROUP BY sg.id";

    @Query(QUICK_BRANCH_QUERY)
    Page<quickBranchData> fetchQuickBranchData(Pageable pageable);

    String QUERY_BRANCH_NAME="SELECT NEW com.queuerite1.demo.DO.companyName(" +
            "c.companyName) FROM Configuration c";
    @Query(QUERY_BRANCH_NAME)
    List<companyName> company_name();

}
