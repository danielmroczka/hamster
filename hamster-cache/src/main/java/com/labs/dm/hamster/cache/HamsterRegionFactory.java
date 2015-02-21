package com.labs.dm.hamster.cache;

import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.*;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cfg.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Properties;

/**
 *
 * @author daniel
 */
public class HamsterRegionFactory implements RegionFactory {

    private final static Logger logger = LoggerFactory.getLogger(HamsterRegionFactory.class);

    @Override
    public void start(Settings settings, Properties properties) throws CacheException {
        if (properties.containsKey(Consts.CONF_KEY)) {
            File f = new File((String) properties.get(Consts.CONF_KEY));
            if (!f.exists()) {
                logger.warn("Missing file: " + properties.get(Consts.CONF_KEY));
            }
        }
        logger.warn("start not supported yet!");
    }

    @Override
    public void stop() {
        logger.warn("stop not supported yet!");
    }

    @Override
    public boolean isMinimalPutsEnabledByDefault() {
        logger.warn("isMinimalPutsEnabledByDefault not supported yet!");
        return true;
    }

    @Override
    public AccessType getDefaultAccessType() {
        return AccessType.READ_WRITE;
    }

    @Override
    public long nextTimestamp() {
        logger.warn("nextTimestamp not supported yet!");
        return System.currentTimeMillis() + 5000;
    }

    @Override
    public EntityRegion buildEntityRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        logger.warn("buildEntityRegion not supported yet!");
        return new HamsterEntityRegion(regionName);
    }

    @Override
    public NaturalIdRegion buildNaturalIdRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        logger.warn("buildNaturalIdRegion not supported yet!");
        return null;
    }

    @Override
    public CollectionRegion buildCollectionRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        logger.warn("buildCollectionRegion not supported yet!");
        return null;
    }

    @Override
    public QueryResultsRegion buildQueryResultsRegion(String regionName, Properties properties) throws CacheException {
        logger.warn("buildQueryResultsRegion not supported yet!");
        return null;
    }

    @Override
    public TimestampsRegion buildTimestampsRegion(String regionName, Properties properties) throws CacheException {
        logger.warn("buildTimestampsRegion not supported yet!");
        return null;
    }

}
