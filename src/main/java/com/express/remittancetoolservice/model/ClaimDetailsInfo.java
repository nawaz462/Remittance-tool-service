package com.express.remittancetoolservice.model;

import com.express.remittancetoolservice.domain.PharmaDetails;
import com.express.remittancetoolservice.domain.RemitDebtCase;
import com.express.remittancetoolservice.domain.RemitNcpdpEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
public class ClaimDetailsInfo {

    private List<PharmaDetails> pharmaDetailsList;
    private List<RemitDebtCase> remitDebtCases;
    private  List<RemitNcpdpEvent> remitNcpdpEvents;

}
