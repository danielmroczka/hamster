package com.labs.dm.hamster.cache.strategies;

import com.labs.dm.hamster.cache.region.HamsterEntityRegion;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.hibernate.cache.spi.access.SoftLock;

/**
 * Created by daniel on 2015-03-25.
 */
public class ReadOnlyEntityRegionAccessStrategy implements EntityRegionAccessStrategy {

    private HamsterEntityRegion entityRegion;

    public ReadOnlyEntityRegionAccessStrategy(HamsterEntityRegion entityRegion) {
        this.entityRegion = entityRegion;
    }

    @Override
    public EntityRegion getRegion() {
        return entityRegion;
    }

    @Override
    public boolean insert(Object key, Object value, Object version) throws CacheException {
        entityRegion.put(key, value);
        return true;
    }

    @Override
    public boolean afterInsert(Object key, Object value, Object version) throws CacheException {
        entityRegion.put(key, value);
        return true;
    }

    @Override
    public boolean update(Object key, Object value, Object currentVersion, Object previousVersion) throws CacheException {
        entityRegion.put(key, value);
        return true;
    }

    @Override
    public boolean afterUpdate(Object key, Object value, Object currentVersion, Object previousVersion, SoftLock lock) throws CacheException {
        entityRegion.put(key, value);
        return true;
    }

    @Override
    public Object get(Object key, long txTimestamp) throws CacheException {
        return entityRegion.get(key);
    }

    @Override
    public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version) throws CacheException {
        entityRegion.put(key, value);
        return true;
    }

    @Override
    public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version, boolean minimalPutOverride) throws CacheException {
        entityRegion.put(key, value);
        return true;
    }

    @Override
    public SoftLock lockItem(Object key, Object version) throws CacheException {
        return null;
    }

    @Override
    public SoftLock lockRegion() throws CacheException {
        return null;
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
