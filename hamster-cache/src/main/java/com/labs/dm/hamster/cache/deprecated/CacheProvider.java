package com.labs.dm.hamster.cache.deprecated;

import org.hibernate.Cache;
import org.hibernate.cache.CacheException;

import java.util.Properties;

/**
 * Created by daniel on 2015-02-25.
 */
public interface CacheProvider {

    Cache buildCache(String regionName, Properties properties) throws CacheException;

    long nextTimestamp();

    void start(Properties properties) throws CacheException;

    void stop();

    boolean isMinimalPutsEnabledByDefault();
}
