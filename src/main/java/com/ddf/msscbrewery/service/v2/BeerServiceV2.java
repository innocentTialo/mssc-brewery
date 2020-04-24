package com.ddf.msscbrewery.service.v2;

import com.ddf.msscbrewery.web.model.BeerDto;
import com.ddf.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by InnocentTIALO on 4/23/2020.
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
