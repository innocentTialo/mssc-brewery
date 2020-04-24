package com.ddf.msscbrewery.service;

import com.ddf.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by InnocentTIALO on 4/18/2020.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
