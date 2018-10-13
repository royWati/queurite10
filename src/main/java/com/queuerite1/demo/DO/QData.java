package com.queuerite1.demo.DO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


@Getter
@Setter

public class QData implements Serializable{

    Long id;
    Date created_on;
    Date updated_on;

    public QData(Long id, Date created_on, Date updated_on) {
        this.id = id;
        this.created_on = created_on;
        this.updated_on = updated_on;
    }

    public QData(){}
}
