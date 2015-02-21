package com.labs.dm.hamster.cache;

import java.util.Properties;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.CollectionRegion;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.NaturalIdRegion;
import org.hibernate.cache.spi.QueryResultsRegion;
import org.hibernate.cache.spi.RegionFactory;
import org.hibernate.cache.spi.TimestampsRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cfg.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author daniel
 */
public class HamsterRegionFactory implements RegionFactory {

    private final static Logger logger = LoggerFactory.getLogger(HamsterRegionFactory.class);

    @Override
    public void start(Settings settings, Properties properties) throws CacheException {
        logger.warn("Not supported yet!");
    }

    @Override
    public void stop() {
        logger.warn("Not supported yet!");
    }

    @Override
    public boolean isMinimalPutsEnabledByDefault() {
        logger.warn("Not supported yet!");
        return true;
    }

    @Override
    public AccessType getDefaultAccessType() {
        return AccessType.READ_ONLY;
    }

    @Override
    public long nextTimestamp() {
        logger.warn("Not supported yet!");
        return 0;
    }

    @Override
    public EntityRegion buildEntityRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        logger.warn("Not supported yet!");
        return new HamsterEntityRegion();
    }

    @Override
    public NaturalIdRegion buildNaturalIdRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        logger.warn("Not supported yet!");
        return null;
    }

    @Override
    public CollectionRegion buildCollectionRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        logger.warn("Not supported yet!");
        return null;
    }

    @Override
    public QueryResultsRegion buildQueryResultsRegion(String regionName, Properties properties) throws CacheException {
        logger.warn("Not supported yet!");
        return null;
    }

    @Override
    public TimestampsRegion buildTimestampsRegion(String regionName, Properties properties) throws CacheException {
        logger.warn("Not supported yet!");
        return null;
    }

}
