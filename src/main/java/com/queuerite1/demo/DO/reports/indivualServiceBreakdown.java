package com.queuerite1.demo.DO.reports;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class indivualServiceBreakdown {
    private long count;
    private long user_id;
    private String name;
    private double avg_service_time;

    public indivualServiceBreakdown(long count, long user_id, String name, double avg_service_time) {
        this.count = count;
        this.user_id = user_id;
        this.name = name;
        this.avg_service_time = avg_service_time;
    }

    public indivualServiceBreakdown() {
    }

    public String getAvg_service_time() {
        int seconds = (int) ((avg_service_time/1000)%60);
        int minutes = (int) ((avg_service_time/1000*60)%60);

        if(seconds==1){
            return minutes+" minutes "+seconds+" second";
        }else{
            return minutes+" minutes "+seconds+" seconds";
        }
    }
}
