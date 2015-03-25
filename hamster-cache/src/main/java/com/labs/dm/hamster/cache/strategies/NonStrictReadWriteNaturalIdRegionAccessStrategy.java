package com.labs.dm.hamster.cache.strategies;

import com.labs.dm.hamster.cache.region.HamsterNaturalIdRegion;
import org.hibernate.cache.spi.access.NaturalIdRegionAccessStrategy;

/**
 * Created by daniel on 2015-03-25.
 */
public class NonStrictReadWriteNaturalIdRegionAccessStrategy extends ReadOnlyNaturalIdRegionAccessStrategy implements NaturalIdRegionAccessStrategy {

    public NonStrictReadWriteNaturalIdRegionAccessStrategy(HamsterNaturalIdRegion hamsterNaturalIdRegion) {
        super(hamsterNaturalIdRegion);
    }
}
