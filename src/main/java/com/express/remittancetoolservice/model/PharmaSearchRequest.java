package com.express.remittancetoolservice.model;


import lombok.Data;

import java.util.Date;

@Data
public class PharmaSearchRequest {

    private String fund;
    private String ncpdpNbr;
    private String claimNbr;
    private String pharmacyName;
    private Date  eventDate;
    private String caseId;
    private String debtAmount;
    private String openDebtAmount;
    private String debtStatus;
    private Date closedDate;

}
