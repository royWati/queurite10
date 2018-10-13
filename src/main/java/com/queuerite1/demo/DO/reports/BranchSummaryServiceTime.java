package com.queuerite1.demo.DO.reports;

import com.queuerite1.demo.DO.BuildString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchSummaryServiceTime implements BuildString{

    private Long longestServiceTime;
    private Long shortestServiceTime;
    private Double averageServiceTime;

    public BranchSummaryServiceTime(Long longestServiceTime, Long shortestServiceTime, Double averageServiceTime) {
        this.longestServiceTime = longestServiceTime;
        this.shortestServiceTime = shortestServiceTime;
        this.averageServiceTime = averageServiceTime;
    }

    public BranchSummaryServiceTime() {
    }

    public String getLongestServiceTime() {
        return build(longestServiceTime);
    }

    public String getShortestServiceTime() {
        return build(shortestServiceTime);
    }

    public String getAverageServiceTime() {
        return build(averageServiceTime);
    }

    @Override
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
    @Override
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
