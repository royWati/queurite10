package com.queuerite1.demo.repos;

import com.queuerite1.demo.DO.serviceWaiting;
import com.queuerite1.demo.entities.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface serviceRepository extends JpaRepository<Service,Long> {

     String QUERY_URL="SELECT " +
             "new com.queuerite1.demo.DO.serviceWaiting( AVG(UNIX_TIMESTAMP(q.updatedOn)-" +
             "UNIX_TIMESTAMP(q.createdOn))," +
            "s.name," +
            "sg.name," +
            "COUNT(q.id))" +
            " from Queue q INNER JOIN Service s ON q.serviceId=s.id " +
            " INNER JOIN ServiceGroup sg ON s.serviceGroup=sg.id " +
            "WHERE q.queueStatus='FINISHED' GROUP BY s.id ";
    @Query(QUERY_URL)
    Page<serviceWaiting> getAvgWaitingTimeForStations(Pageable pageable);
}
