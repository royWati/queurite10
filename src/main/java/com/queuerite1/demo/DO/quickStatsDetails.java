package com.queuerite1.demo.DO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class quickStatsDetails {
    public String companyName;
    public Page<quickBranchData> details;

    public quickStatsDetails(String s, Page<quickBranchData> quickBranchData) {
    }
}
