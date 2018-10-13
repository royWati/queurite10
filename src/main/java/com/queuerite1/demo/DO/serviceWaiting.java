package com.queuerite1.demo.DO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class serviceWaiting implements Serializable{

    public double AVG_WAITING_TIME;
    public String service_name;
    public String service_group_name;
    public Long total_cards;

    public serviceWaiting(double AVG_WAITING_TIME, String service_name, String service_group_name, Long total_cards) {
        this.AVG_WAITING_TIME = AVG_WAITING_TIME;
        this.service_name = service_name;
        this.service_group_name = service_group_name;
        this.total_cards = total_cards;
    }
    public String getAVG_WAITING_TIME() {
        int seconds = (int) ((AVG_WAITING_TIME/1000)%60);
        int minutes = (int) ((AVG_WAITING_TIME/1000*60)%60);
        return minutes+" minutes "+seconds+" seconds";
    }
}
