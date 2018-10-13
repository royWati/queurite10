package com.queuerite1.demo.DO.reports;

import com.queuerite1.demo.DO.BuildString;

public class ServiceReportWaitingTime implements BuildString{
    private Long longestWaitingTime;
    private Long shortestWaitingTime;
    private Double avgWaitingTime;
    private Long sectionId;
    private String name;

    public ServiceReportWaitingTime(Long longestWaitingTime, Long shortestWaitingTime, Double avgWaitingTime, Long sectionId, String name) {
        this.longestWaitingTime = longestWaitingTime;
        this.shortestWaitingTime = shortestWaitingTime;
        this.avgWaitingTime = avgWaitingTime;
        this.sectionId = sectionId;
        this.name = name;
    }

    public ServiceReportWaitingTime() {
    }

    public String getLongestServiceTime() {
        return  build(longestWaitingTime);
    }

    public String getShortestServiceTime() {
        return   build(shortestWaitingTime);
    }

    public String getAvgServiceTime() {
        return build(avgWaitingTime);
    }

    public Long getSectionId() {
        return sectionId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String build(Long value) {
        int minutes = (int) ((value)/60);
        int seconds = (int)((value)%60);

        if(minutes<60){
            return minutes+"mins "+seconds+" secs";
        }else{
            int hours = minutes/60;
            minutes = minutes % 60;
            //return String.valueOf(value)+"";
            return hours+"hrs "+minutes+"mins "+seconds+" secs";
        }


    }

    @Override
    public String build(Double value) {
        int minutes = (int) ((value)/60);
        int seconds = (int)((value)%60);

        if(minutes<60){
            return minutes+"mins "+seconds+" secs";
        }else{
            int hours = minutes/60;
            minutes = minutes % 60;

            return hours+"hrs "+minutes+"mins "+seconds+" secs";
            //return String.valueOf(value);
        }
    }
}
