package com.express.remittancetoolservice.repository;

import com.express.remittancetoolservice.domain.PharmaDetails;
import com.express.remittancetoolservice.model.PharmaSearchRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TPharmaSearchRepository extends JpaRepository<PharmaDetails,String>{

    PharmaDetails findByNcpdpNbr(String ncpdpNbr);

    //@Query("select rne.fund as fund, rne.ncpdpNbr as NcpdpNbr, rne.claimNbr as claimNbr, pd.pharmacyName as Pharmacy_Name, rne.eventDate as eventDate, rne.caseId as caseId, rdc.debtAmount as debtAmount, rdc.openDebtAmount as openDebtAmount, rdc.debtStatus as debtStatus, rne.closedDate as closedDate from RemitNcpdpEvent rne join RemitDebtCase rdc on rne.caseId = rdc.caseId join PharmaDetails pd on rne.ncpdpNbr = :ncpdpNbr")
    @Query(value = "select rne.fund as fund, rne.ncpdpNbr as NcpdpNbr, rne.claimNbr as claimNbr, pd.pharmacyName as Pharmacy_Name, rne.eventDate as eventDate, rne.caseId as caseId, rdc.debtAmount as debtAmount, rdc.openDebtAmount as openDebtAmount, rdc.debtStatus as debtStatus, rne.closedDate as closedDate from RemitNcpdpEvent rne join RemitDebtCase rdc on rne.caseId = rdc.caseId join PharmaDetails pd on rne.ncpdpNbr = pd.ncpdpNbr where rne.ncpdpNbr = :ncpdpNbr ", nativeQuery = true)
    PharmaSearchRequest getSearchResponse(@Param("ncpdpNbr") String ncpdpNbr);

}
