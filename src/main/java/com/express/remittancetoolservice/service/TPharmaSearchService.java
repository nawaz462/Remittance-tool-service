package com.express.remittancetoolservice.service;

import com.express.remittancetoolservice.domain.PharmaDetails;
import com.express.remittancetoolservice.model.PharmaSearchRequest;
import org.springframework.stereotype.Service;

@Service
public interface TPharmaSearchService {

    PharmaDetails getPharmaDetails(PharmaSearchRequest pharmaSearchRequest) ;
}
