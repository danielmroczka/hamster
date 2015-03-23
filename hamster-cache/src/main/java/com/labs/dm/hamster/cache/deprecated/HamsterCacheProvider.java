package com.labs.dm.hamster.cache.deprecated;

import org.hibernate.Cache;
import org.hibernate.cache.CacheException;

import java.util.Properties;

/**
 * Created by daniel on 2015-02-25.
 */
public class HamsterCacheProvider implements CacheProvider {

    @Override
    public Cache buildCache(String regionName, Properties properties) throws CacheException {
        return new HamsterCache(regionName);
    }

    @Override
    public long nextTimestamp() {
        return Timestamper.next();
    }

    @Override
    public void start(Properties properties) throws CacheException {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isMinimalPutsEnabledByDefault() {
        return false;
    }
}
