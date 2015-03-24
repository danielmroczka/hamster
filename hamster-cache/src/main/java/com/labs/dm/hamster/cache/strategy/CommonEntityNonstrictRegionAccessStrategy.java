package com.labs.dm.hamster.cache.strategy;

import com.labs.dm.hamster.cache.region.HamsterEntityRegion;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.hibernate.cache.spi.access.RegionAccessStrategy;
import org.hibernate.cache.spi.access.SoftLock;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 2015-03-24.
 */
public class CommonEntityNonstrictRegionAccessStrategy implements RegionAccessStrategy, EntityRegionAccessStrategy {

    private final HamsterEntityRegion region;
    private Map<Object, Object> map = new HashMap();

    public CommonEntityNonstrictRegionAccessStrategy(HamsterEntityRegion region) {
        this.region = region;

    }


    @Override
    public EntityRegion getRegion() {
        return region;
    }

    @Override
    public boolean insert(Object key, Object value, Object version) throws CacheException {
        map.put(key, value);
        return true;
    }

    @Override
    public boolean afterInsert(Object key, Object value, Object version) throws CacheException {
        return false;
    }

    @Override
    public boolean update(Object key, Object value, Object currentVersion, Object previousVersion) throws CacheException {
        return false;
    }

    @Override
    public boolean afterUpdate(Object key, Object value, Object currentVersion, Object previousVersion, SoftLock lock) throws CacheException {
        return false;
    }

    @Override
    public Object get(Object key, long txTimestamp) throws CacheException {
        return map.get(key);
    }

    @Override
    public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version) throws CacheException {
        map.put(key, value);
        return true;
    }

    @Override
    public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version, boolean minimalPutOverride) throws CacheException {
        map.put(key, value);
        return true;
    }

    @Override
    public SoftLock lockItem(Object key, Object version) throws CacheException {
        return new SoftLock() {

        };
    }

    @Override
    public SoftLock lockRegion() throws CacheException {
        return new SoftLock() {

        };

    }

    @Override
    public void unlockItem(Object key, SoftLock lock) throws CacheException {

    }

    @Override
    public void unlockRegion(SoftLock lock) throws CacheException {

    }

    @Override
    public void remove(Object key) throws CacheException {

    }

    @Override
    public void removeAll() throws CacheException {

    }

    @Override
    public void evict(Object key) throws CacheException {

    }

    @Override
    public void evictAll() throws CacheException {

    }

}
