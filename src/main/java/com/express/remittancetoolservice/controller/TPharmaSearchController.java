package com.express.remittancetoolservice.controller;

import com.express.remittancetoolservice.domain.PharmaDetails;
import com.express.remittancetoolservice.model.ClaimDetailsInfo;
import com.express.remittancetoolservice.model.PharmaSearchRequest;
import com.express.remittancetoolservice.repository.TPharmaSearchRepository;
import com.express.remittancetoolservice.service.TPharmaSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TPharmaSearchController {

    @Autowired
    private TPharmaSearchService tPharmaSearchService;

    @Autowired
    private TPharmaSearchRepository tPharmaSearchRepository;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public PharmaDetails getPharmaDetails(@RequestBody PharmaSearchRequest pharmaSearchRequest){

        return tPharmaSearchService.getPharmaDetails(pharmaSearchRequest);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addClaimDetails(@RequestBody ClaimDetailsInfo claimDetailsInfo){

        tPharmaSearchRepository.saveAll(claimDetailsInfo.getPharmaDetailsList());
        return "Records added successfully";
    }

}
