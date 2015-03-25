package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.TransactionalDataRegion;

import java.util.Properties;

/**
 * Created by daniel on 2015-03-25.
 */
public class HamsterTransactionalDataRegion extends HamsterGeneralDataRegion implements TransactionalDataRegion {
    public HamsterTransactionalDataRegion(String regionName, CacheDataDescription metadata, Properties properties) {
        super(regionName, metadata, properties);
    }

    @Override
    public boolean isTransactionAware() {
        return true;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return null;
    }
}
