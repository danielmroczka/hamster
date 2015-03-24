package com.labs.dm.hamster.cache.region;

import com.labs.dm.hamster.cache.strategy.CommonEntityNonstrictRegionAccessStrategy;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.Region;
import org.hibernate.cache.spi.TransactionalDataRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author daniel
 */
public class HamsterEntityRegion implements EntityRegion, TransactionalDataRegion, Region {

    private final static Logger logger = LoggerFactory.getLogger(HamsterEntityRegion.class);

    private final String regionName;

    public HamsterEntityRegion(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public EntityRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        return new CommonEntityNonstrictRegionAccessStrategy(this);
    }

    @Override
    public boolean isTransactionAware() {
        logger.warn("isTransactionAware not supported yet!");
        return false;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return new CacheDataDescription() {

            @Override
            public boolean isMutable() {
                logger.warn("isMutable not supported yet!");
                return false;
            }

            @Override
            public boolean isVersioned() {
                logger.warn("isVersioned not supported yet!");
                return false;
            }

            @Override
            public Comparator getVersionComparator() {
                return new Comparator() {

                    @Override
                    public int compare(Object o1, Object o2) {
                        logger.warn("compare not supported yet!");
                        return 0;
                    }
                };
            }
        };
    }

    @Override
    public String getName() {
        logger.warn("getName not supported yet!");
        return regionName;
    }

    @Override
    public void destroy() throws CacheException {
        logger.warn("destroy not supported yet!");
    }

    @Override
    public boolean contains(Object key) {
        logger.warn("contains not supported yet!");
        return false;
    }

    @Override
    public long getSizeInMemory() {
        logger.warn("getSizeInMemory not supported yet!");
        return 0;
    }

    @Override
    public long getElementCountInMemory() {
        logger.warn("getElementCountInMemory not supported yet!");
        return 0;
    }

    @Override
    public long getElementCountOnDisk() {
        logger.warn("getElementCountOnDisk not supported yet!");
        return 0;
    }

    @Override
    public Map toMap() {
        logger.warn("toMap not supported yet!");
        return new HashMap();
    }

    @Override
    public long nextTimestamp() {
        logger.warn("nextTimestamp not supported yet!");
        return 0;
    }

    @Override
    public int getTimeout() {
        return 60;
    }

}
