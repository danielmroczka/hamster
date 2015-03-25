package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.CollectionRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.CollectionRegionAccessStrategy;

import java.util.Properties;

/**
 * Created by daniel on 2015-03-23.
 */
public class HamsterCollectionRegion extends GeneralDataHamsterRegion implements CollectionRegion {

    public HamsterCollectionRegion(String regionName, Properties properties, CacheDataDescription metadata) {
        super(regionName, metadata, properties);
    }

    @Override
    public CollectionRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        return null;
    }


    @Override
    public boolean isTransactionAware() {
        return false;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return null;
    }
}
