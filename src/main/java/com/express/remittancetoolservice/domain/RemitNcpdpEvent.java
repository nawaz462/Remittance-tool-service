package com.express.remittancetoolservice.domain;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REMIT_NCPDP_EVENT")
public class RemitNcpdpEvent implements Serializable{

    @Id
    @Column(name = "NCPDP_NBR")
    private String ncpdpNbr;

    @Column(name = "FUND")
    private String fund;

    @Column(name = "CASE_ID")
    private String caseId;

    @Column(name = "CLAIM_NBR")
    private String claimNbr;

    @Column(name = "EVENT_DATE")
    private Date eventDate;

    @Column(name = "CLOSED_DATE")
    private Date closedDate;

    @Column(name = "CLOSED_REASON_CD")
    private String closedReasonCode;

}
