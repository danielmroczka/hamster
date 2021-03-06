package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.GeneralDataRegion;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by daniel on 2015-03-25.
 */
public abstract class HamsterGeneralDataRegion extends HamsterDataRegion implements GeneralDataRegion {

    protected CacheDataDescription metadata;
    private String regionName;
    private Properties properties;
    private Map<Object, Object> map = new HashMap<>();

    public HamsterGeneralDataRegion(String regionName, CacheDataDescription metadata, Properties properties) {
        this.regionName = regionName;
        this.metadata = metadata;
        this.properties = properties;
    }

    @Override
    public Object get(Object key) throws CacheException {
        if (key == null) {
            return null;
        }
        Object result = map.get(key);
        System.out.println(result);
        return result;
    }

    @Override
    public void put(Object key, Object value) throws CacheException {
        map.put(key, value);
    }

    @Override
    public void evict(Object o) throws CacheException {
        map.remove(o);
    }

    @Override
    public void evictAll() throws CacheException {
        map.clear();
    }

    @Override
    public String getName() {
        return regionName;
    }

    @Override
    public void destroy() throws CacheException {
        map = null;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public long getSizeInMemory() {
        return 0;
    }

    @Override
    public long getElementCountInMemory() {
        return map.size();
    }

    @Override
    public long getElementCountOnDisk() {
        return 0;
    }

    @Override
    public Map toMap() {
        return map;
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
