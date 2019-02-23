package com.express.remittancetoolservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REMIT_DEBT_CASE")
public class RemitDebtCase implements Serializable{

    @Id
    @Column(name = "CASE_ID")
    private String caseId;

    @Column(name = "DEBT_AMOUNT")
    private float debtAmount;

    @Column(name = "OPEN_DEBT_AMOUNT")
    private float openDebtAmount;

    @Column(name = "DEBT_STATUS")
    private String debtStatus;

    @Column(name = "CLOSED_REASON_CD")
    private String closedReasonCode;

}
