package com.queuerite1.demo.repos;

import com.queuerite1.demo.DO.reports.*;
public class QueryStatements {

    public static String INDIVIUAL_SERVICE_BREAKDOWN =
            "SELECT NEW com.queuerite1.demo.DO.reports.indivualServiceBreakdown(" +
                    "count(q.id) as count," +
                    "q.user_id," +
                    "s.username," +
                    "AVG(UNIX_TIMESTAMP(q.created_on)-UNIX_TIMESTAMP(q1.created_on)) " +
                    " AS avg_service_time )" +
                    "  FROM queue_log q  JOIN users s on q.user_id=s.id " +
                    "JOIN queue_log q1 ON q.queue_id=q1.queue_id " +
                    "WHERE q.log_type='FINISH' AND q1.log_type='START'" +
                    " AND q.created_on >= ?1 AND q.created_on <= ?2 " +
                    "GROUP BY q.user_id";
}
