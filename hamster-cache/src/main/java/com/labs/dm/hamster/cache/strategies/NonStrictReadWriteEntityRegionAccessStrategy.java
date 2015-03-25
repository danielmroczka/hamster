package com.labs.dm.hamster.cache.strategies;

import com.labs.dm.hamster.cache.region.HamsterEntityRegion;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;

/**
 * Created by daniel on 2015-03-25.
 */
public class NonStrictReadWriteEntityRegionAccessStrategy extends ReadOnlyEntityRegionAccessStrategy implements EntityRegionAccessStrategy {
    public NonStrictReadWriteEntityRegionAccessStrategy(HamsterEntityRegion hamsterEntityRegion) {
        super(hamsterEntityRegion);
    }
}
