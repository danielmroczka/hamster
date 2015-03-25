package com.labs.dm.hamster.cache.strategies;

import com.labs.dm.hamster.cache.region.HamsterNaturalIdRegion;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.NaturalIdRegion;
import org.hibernate.cache.spi.access.NaturalIdRegionAccessStrategy;
import org.hibernate.cache.spi.access.SoftLock;

/**
 * Created by daniel on 2015-03-25.
 */
public class ReadOnlyNaturalIdRegionAccessStrategy implements NaturalIdRegionAccessStrategy {

    private HamsterNaturalIdRegion hamsterNaturalIdRegion;

    public ReadOnlyNaturalIdRegionAccessStrategy(HamsterNaturalIdRegion hamsterNaturalIdRegion) {
        this.hamsterNaturalIdRegion = hamsterNaturalIdRegion;
    }

    @Override
    public NaturalIdRegion getRegion() {
        return hamsterNaturalIdRegion;
    }

    @Override
    public boolean insert(Object key, Object value) throws CacheException {
        hamsterNaturalIdRegion.put(key, value);
        return true;
    }

    @Override
    public boolean afterInsert(Object key, Object value) throws CacheException {
        hamsterNaturalIdRegion.put(key, value);
        return true;
    }

    @Override
    public boolean update(Object key, Object value) throws CacheException {
        hamsterNaturalIdRegion.put(key, value);
        return true;
    }

    @Override
    public boolean afterUpdate(Object key, Object value, SoftLock lock) throws CacheException {
        hamsterNaturalIdRegion.put(key, value);
        return true;
    }

    @Override
    public Object get(Object key, long txTimestamp) throws CacheException {
        return hamsterNaturalIdRegion.get(key);
    }

    @Override
    public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version) throws CacheException {
        hamsterNaturalIdRegion.put(key, value);
        return true;
    }

    @Override
    public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version, boolean minimalPutOverride) throws CacheException {
        hamsterNaturalIdRegion.put(key, value);
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
        hamsterNaturalIdRegion.evict(key);
    }

    @Override
    public void removeAll() throws CacheException {
        hamsterNaturalIdRegion.evictAll();
    }

    @Override
    public void evict(Object key) throws CacheException {
        hamsterNaturalIdRegion.evict(key);
    }

    @Override
    public void evictAll() throws CacheException {
        hamsterNaturalIdRegion.evictAll();

    }
}
