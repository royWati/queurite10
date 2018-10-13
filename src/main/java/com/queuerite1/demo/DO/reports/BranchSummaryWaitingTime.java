package com.queuerite1.demo.DO.reports;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchSummaryWaitingTime {
    private Long longestWaitingTime;
    private Long shortestWaitingTime;
    private Double averageWaitingTime;
    public BranchSummaryWaitingTime() {
    }

    public BranchSummaryWaitingTime(Long longestWaitingTime, Long shortestWaitingTime, Double averageWaitingTime) {
        this.longestWaitingTime = longestWaitingTime;
        this.shortestWaitingTime = shortestWaitingTime;
        this.averageWaitingTime = averageWaitingTime;
    }

    public String getLongestWaitingTime() {
        return build(longestWaitingTime);
    }

    public String getShortestWaitingTime() {
        return build(shortestWaitingTime);
    }

    public String getAverageWaitingTime() {
        return build(averageWaitingTime);
    }

    public String build(Long val) {
        int seconds = (int) ((val/1000)%60);
        int minutes = (int) ((val/1000*60)%60);

        if(minutes<60){
            return minutes+"mins "+seconds+" secs";
        }else{
            int hours = minutes/60;
            minutes = minutes % 60;
            return hours+"hrs "+minutes+"mins "+seconds+" secs";
        }
    }
    public String build(Double val) {
        int seconds = (int) ((val/1000)%60);
        int minutes = (int) ((val/1000*60)%60);

        if(minutes<60){
            return minutes+"mins "+seconds+" secs";
        }else{
            int hours = minutes/60;
            minutes = minutes % 60;
            return hours+"hrs "+minutes+"mins "+seconds+" secs";
        }
    }
}
