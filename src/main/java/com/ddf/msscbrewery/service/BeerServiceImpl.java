package com.ddf.msscbrewery.service;

import com.ddf.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by InnocentTIALO on 4/18/2020.
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Galaxy cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
