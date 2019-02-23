package com.express.remittancetoolservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TEDFPT00")
public class PharmaDetails implements Serializable{

    @Id
    @Column(name = "NCPDP_NBR")
    private String ncpdpNbr;

    @Column(name = "PHARMACY_NAME")
    private String pharmacyName;

}
