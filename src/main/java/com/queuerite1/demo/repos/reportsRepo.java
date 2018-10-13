package com.queuerite1.demo.repos;

import com.queuerite1.demo.DO.reports.*;
import com.queuerite1.demo.entities.QueueLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface reportsRepo extends JpaRepository<QueueLog,Long>{

    String INDIVIUAL_SERVICE_BREAKDOWN =
            "SELECT NEW com.queuerite1.demo.DO.reports.indivualServiceBreakdown(" +
                    "count(q.id) as count," +
                    "q.userId," +
                    "s.firstName," +
                    "AVG(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn)) " +
                    " AS avg_service_time )" +
                    "  FROM QueueLog q  JOIN Users s on q.userId=s.id " +
                    "JOIN QueueLog q1 ON q.queueId=q1.queueId " +
                    "WHERE q.logType='FINISH' AND q1.logType='START'" +
                    " AND q.createdOn >= :startedOn AND q.createdOn <= :endedOn " +
                    "GROUP BY q.userId";

    @Query(INDIVIUAL_SERVICE_BREAKDOWN)
    Page<indivualServiceBreakdown> getIndiviualServiceBreakdown(
            @Param("startedOn") Date startData,@Param("endedOn") Date endDate, Pageable pageable
    );

    String BRANCH_SUMMARY_SERVICE_TIME="" +
            "SELECT NEW com.queuerite1.demo.DO.reports.BranchSummaryServiceTime(" +
            "MAX(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS longest_service_time," +
            " MIN(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS shortest_service_time," +
            " AVG(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS avg_service_time " +
            ")"+
            "from QueueLog q " +
            "JOIN QueueLog q1 ON q.queueId = q1.queueId WHERE q.logType='FINISH' " +
            "AND q1.logType='START' AND q.createdOn >= :startDate " +
            "and q.createdOn <= :endDate";
    String BRANCH_SUMMARY_WAITING_TIME= "SELECT NEW com.queuerite1.demo.DO.reports.BranchSummaryWaitingTime(" +
            "MAX(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS longest_service_time," +
            " MIN(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS shortest_service_time," +
            " AVG(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS avg_service_time " +
            ")"+
            "from QueueLog q " +
            "JOIN QueueLog q1 ON q.queueId = q1.queueId WHERE q.logType='START' " +
            "AND q1.logType='NEW' AND q.createdOn>= :startDate " +
            "and q.createdOn <= :endDate";

    String BRANCH_SUMMARY_TOTAL_QUEUES="SELECT NEW com.queuerite1.demo.DO.reports.BranchSummaryNoOfCust(" +
            " COUNT(q.id) as total) FROM   Queue q " +
            "WHERE q.createdOn >=:startDate AND q.createdOn <=:endDate";
    @Query(BRANCH_SUMMARY_SERVICE_TIME)
    List<BranchSummaryServiceTime> fetchBranchServiceSummary(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
    @Query(BRANCH_SUMMARY_WAITING_TIME)
    List<BranchSummaryWaitingTime> fetchBranchWaitingSummary(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
    @Query(BRANCH_SUMMARY_TOTAL_QUEUES)
    List<BranchSummaryNoOfCust>  fetchTotalCustomers(@Param("startDate")Date startDate,@Param("endDate") Date endDate);


    String SERVICE_REPORTS_SERV_TIME="SELECT NEW com.queuerite1.demo.DO.reports.ServiceReportsServTime(" +
            "MAX(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS longest_service_time," +
            " MIN(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS shortest_service_time," +
            " AVG(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS avg_service_time," +
            " SUM(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS total_service_time, " +
            "q.sectionId," +
            "s.name " +
            ")"+
            "from QueueLog q " +
            "JOIN QueueLog q1 ON q.queueId = q1.queueId INNER JOIN Section s ON q.sectionId=s.id " +
            "WHERE q.logType='FINISH' AND q1.logType='START' AND q.createdOn >= :startDate " +
            "AND q.createdOn <= :endDate GROUP BY q.sectionId";

    String SERVICE_REPORTS_WAIT_TIME="SELECT NEW com.queuerite1.demo.DO.reports.ServiceReportWaitingTime(" +
            "MAX(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS longest_waiting_time," +
            " MIN(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS shortest_waiting_time," +
            " AVG(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS avg_waiting_time," +
            "q.sectionId," +
            "s.name " +
            ")"+
            "from QueueLog q " +
            "JOIN QueueLog q1 ON q.queueId = q1.queueId INNER JOIN Section s ON q.sectionId=s.id " +
            "WHERE q.logType='START' AND q1.logType='NEW' AND q.createdOn >= :startDate " +
            "AND q.createdOn <= :endDate GROUP BY q.sectionId";

    @Query(SERVICE_REPORTS_SERV_TIME)
    List<ServiceReportsServTime> fetchServiceReportServTime(@Param("startDate") Date startDate,@Param("endDate") Date endDate);

    @Query(SERVICE_REPORTS_WAIT_TIME)
    List<ServiceReportWaitingTime> fetchServiceReportWaitingTime(@Param("startDate") Date startDate,@Param("endDate") Date endDate);

    String INDIVIUAL_PERFORMANCE = "SELECT NEW com.queuerite1.demo.DO.reports.IndividualPerfomance( " +
            "count(q.id) as count," +
            "q.userId," +
            "s.username," +
            "AVG(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn))  AS avg_service_time," +
            "MAX(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn)) AS longest_service_time," +
            "MIN(UNIX_TIMESTAMP(q.createdOn)-UNIX_TIMESTAMP(q1.createdOn)) AS longest_service_time" +
            " ) FROM QueueLog q  JOIN Users s on q.userId=s.id " +
            "JOIN QueueLog q1 ON q.queueId=q1.queueId " +
            "WHERE q.logType='FINISH' AND q1.logType='START' AND q.createdOn >= :startDate AND q.createdOn <= :endDate " +
            "GROUP BY q.userId ";

    @Query(INDIVIUAL_PERFORMANCE)
    List<IndividualPerfomance> fetchIndiviualPerfomance(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
