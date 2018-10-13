package com.queuerite1.demo.DO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class companyName {
    public String company_name;

    public companyName(String company_name) {
        this.company_name = company_name;
    }
}
