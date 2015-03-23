package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.QueryResultsRegion;

import java.util.Map;

/**
 * Created by daniel on 2015-03-23.
 */
public class HamsterQueryResultsRegion implements QueryResultsRegion {
    @Override
    public Object get(Object key) throws CacheException {
        return null;
    }

    @Override
    public void put(Object key, Object value) throws CacheException {

    }

    @Override
    public void evict(Object key) throws CacheException {

    }

    @Override
    public void evictAll() throws CacheException {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void destroy() throws CacheException {

    }

    @Override
    public boolean contains(Object key) {
        return false;
    }

    @Override
    public long getSizeInMemory() {
        return 0;
    }

    @Override
    public long getElementCountInMemory() {
        return 0;
    }

    @Override
    public long getElementCountOnDisk() {
        return 0;
    }

    @Override
    public Map toMap() {
        return null;
    }

    @Override
    public long nextTimestamp() {
        return 0;
    }

    @Override
    public int getTimeout() {
        return 0;
    }
}
