package com.labs.dm.hamster.cache.region;

import com.labs.dm.hamster.cache.strategies.ReadOnlyNaturalIdRegionAccessStrategy;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.NaturalIdRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.NaturalIdRegionAccessStrategy;

import java.util.Properties;

/**
 * Created by daniel on 2015-03-23.
 */
public class HamsterNaturalIdRegion extends GeneralDataHamsterRegion implements NaturalIdRegion {


    public HamsterNaturalIdRegion(String regionName, Properties properties, CacheDataDescription metadata) {
        super(regionName, metadata, properties);
    }

    @Override
    public NaturalIdRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        switch (accessType) {
            case READ_ONLY:
                return new ReadOnlyNaturalIdRegionAccessStrategy(this);
            case READ_WRITE:
                return new ReadOnlyNaturalIdRegionAccessStrategy(this);
            default:
                throw new CacheException("Unsupported access strategy : " + accessType + ".");
        }
    }

    @Override
    public boolean isTransactionAware() {
        return false;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return metadata;
    }


}
