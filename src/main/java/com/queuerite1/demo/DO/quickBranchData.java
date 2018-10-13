package com.queuerite1.demo.DO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class quickBranchData implements Serializable {

    public long total_entries;
    public  double avg_waiting_time;
    public String service_group_name;

    public quickBranchData(long total_entries, double avg_waiting_time, String service_group_name) {
        this.total_entries = total_entries;
        this.avg_waiting_time = avg_waiting_time;
        this.service_group_name = service_group_name;
    }

    public String getAvg_waiting_time() {
        int seconds = (int) ((avg_waiting_time/1000)%60);
        int minutes = (int) ((avg_waiting_time/1000*60)%60);

        if(seconds==1){
            return minutes+" minutes "+seconds+" second";
        }else{
            return minutes+" minutes "+seconds+" seconds";
        }
    }

}
