package com.queuerite1.demo.repos;

public class Queries {

    String QUICK_BRANCH_QUERY="SELECT NEW com.queuerite1.demo.DO.quickBranchData(" +
            "COUNT(q.id) as total_entries," +
            "AVG(UNIX_TIMESTAMP(q.updatedOn)-UNIX_TIMESTAMP(q.createdOn)) as avg_waiting," +
            "sg.name) " +
            "  FROM Queue q " +
            "INNER JOIN Service s ON q.serviceId=s.id" +
            " INNER JOIN ServiceGroup sg ON s.serviceGroup=sg.id" +
            " GROUP BY sg.id";

    public static String QUEUE_TIME="SELECT NEW " +
            "com.queuerite1.demo.DO.QData(q.id,q.createdOn,q.updatedOn) FROM Queue q";
}
