package com.ddf.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by InnocentTIALO on 4/23/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;
}
