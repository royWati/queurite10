package com.queuerite1.demo.DO.reports;

import com.queuerite1.demo.DO.BuildString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndividualPerfomance implements BuildString {

    private Long count;
    private Long user_id;
    private String username;
    private Double avg_service_time;
    private Long longest_service_time;
    private Long shortest_service_time;

    public IndividualPerfomance(Long count, Long user_id, String username,
                                Double avg_service_time, Long longest_service_time,
                                Long shortest_service_time) {
        this.count = count;
        this.user_id = user_id;
        this.username = username;
        this.avg_service_time = avg_service_time;
        this.longest_service_time = longest_service_time;
        this.shortest_service_time = shortest_service_time;
    }

    public IndividualPerfomance() {
    }

    public String getAvg_service_time() {
        return build(avg_service_time);
    }

    public String getLongest_service_time() {
        return build(longest_service_time);
    }

    public String getShortest_service_time() {
        return build(shortest_service_time);
    }

    @Override
    public String build(Long value) {
        int minutes = (int) ((value) / 60);
        int seconds = (int) ((value) % 60);

        if (minutes < 60) {
            return minutes + "mins " + seconds + " secs";
        } else {
            int hours = minutes / 60;
            minutes = minutes % 60;
            return hours + "hrs " + minutes + "mins " + seconds + " secs";
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
