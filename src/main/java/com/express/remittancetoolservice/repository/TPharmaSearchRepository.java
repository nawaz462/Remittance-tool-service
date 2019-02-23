package com.express.remittancetoolservice.repository;

import com.express.remittancetoolservice.domain.PharmaDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPharmaSearchRepository extends JpaRepository<PharmaDetails,String>{

    PharmaDetails findByNcpdpNbr(String ncpdpNbr);
}
