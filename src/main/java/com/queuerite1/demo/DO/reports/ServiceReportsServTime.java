package com.queuerite1.demo.DO.reports;

import com.queuerite1.demo.DO.BuildString;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Getter
@Setter
public class ServiceReportsServTime implements BuildString{

    private Long longestServiceTime;
    private Long shortestServiceTime;
    private Double avgServiceTime;
    private Long totalServiceTime;
    private Long sectionId;
    private String name;

    public ServiceReportsServTime(Long longestServiceTime, Long shortestServiceTime, Double avgServiceTime,
                                  Long totalServiceTime, Long sectionId, String name) {
        this.longestServiceTime = longestServiceTime;
        this.shortestServiceTime = shortestServiceTime;
        this.avgServiceTime = avgServiceTime;
        this.totalServiceTime = totalServiceTime;
        this.sectionId = sectionId;
        this.name = name;
    }

    public ServiceReportsServTime() {
    }

    public String getLongestServiceTime() {
        return build(longestServiceTime);
    }

    public String getShortestServiceTime() {
        return build(shortestServiceTime);
    }

    public String getAvgServiceTime() {
        return build(avgServiceTime);
    }

    public String getTotalServiceTime() {
        return build(totalServiceTime);
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
            return hours+"hrs "+minutes+"mins "+seconds+" secs";
            //return String.valueOf(value);
        }


    }

    @Override
    public String build(Double value) {
        int minutes = (int) ((value)/60);
        int seconds = (int)((value)%60);

        if(minutes<60){
            return minutes+" mins "+seconds+" secs";
        }else{
            int hours = minutes/60;
            minutes = minutes % 60;
            return hours+" hrs "+minutes+" mins "+seconds+" secs";
            //return String.valueOf(value);
        }
    }
}
