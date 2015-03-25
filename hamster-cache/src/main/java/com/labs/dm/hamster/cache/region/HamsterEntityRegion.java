package com.labs.dm.hamster.cache.region;

import com.labs.dm.hamster.cache.strategies.NonStrictReadWriteEntityRegionAccessStrategy;
import com.labs.dm.hamster.cache.strategies.ReadOnlyEntityRegionAccessStrategy;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author daniel
 */
public class HamsterEntityRegion extends GeneralDataHamsterRegion implements EntityRegion {

    private final static Logger logger = LoggerFactory.getLogger(HamsterEntityRegion.class);

    public HamsterEntityRegion(String regionName, Properties properties, CacheDataDescription metadata) {
        super(regionName, metadata, properties);
    }

    @Override
    public EntityRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        switch (accessType) {
            case READ_ONLY:
                return new ReadOnlyEntityRegionAccessStrategy(this);
            case NONSTRICT_READ_WRITE:
                return new NonStrictReadWriteEntityRegionAccessStrategy(this);
            default:
                throw new CacheException("Unsupported access strategy : " + accessType + ".");
        }
    }

    @Override
    public boolean isTransactionAware() {
        logger.warn("isTransactionAware not supported yet!");
        return false;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return metadata;
    }


}
