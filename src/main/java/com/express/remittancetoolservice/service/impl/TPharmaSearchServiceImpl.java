package com.express.remittancetoolservice.service.impl;

import com.express.remittancetoolservice.domain.PharmaDetails;
import com.express.remittancetoolservice.model.PharmaSearchRequest;
import com.express.remittancetoolservice.repository.TPharmaSearchRepository;
import com.express.remittancetoolservice.service.TPharmaSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TPharmaSearchServiceImpl implements TPharmaSearchService {

    @Autowired
    private TPharmaSearchRepository tPharmaSearchRepo;


    @Override
    public PharmaDetails getPharmaDetails(PharmaSearchRequest pharmaSearchRequest) {
        return tPharmaSearchRepo.findByNcpdpNbr(pharmaSearchRequest.getNcpdpNbr());
    }
}
