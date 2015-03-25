package com.labs.dm.hamster.cache;

import com.labs.dm.hamster.cache.region.*;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.*;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cfg.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Properties;

/**
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
        return AccessType.READ_ONLY;
    }

    @Override
    public long nextTimestamp() {
        logger.warn("nextTimestamp not supported yet!");

        return System.currentTimeMillis() + 5000;
    }

    @Override
    public EntityRegion buildEntityRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        return new HamsterEntityRegion(regionName, properties, metadata);
    }

    @Override
    public NaturalIdRegion buildNaturalIdRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        return new HamsterNaturalIdRegion(regionName, properties, metadata);
    }

    @Override
    public CollectionRegion buildCollectionRegion(String regionName, Properties properties, CacheDataDescription metadata) throws CacheException {
        return new HamsterCollectionRegion(regionName, properties, metadata);
    }

    @Override
    public QueryResultsRegion buildQueryResultsRegion(String regionName, Properties properties) throws CacheException {
        return new HamsterQueryResultsRegion(regionName, null, properties);
    }

    @Override
    public TimestampsRegion buildTimestampsRegion(String regionName, Properties properties) throws CacheException {
        return new HamsterTimestampRegion(regionName, null, properties);
    }

}
