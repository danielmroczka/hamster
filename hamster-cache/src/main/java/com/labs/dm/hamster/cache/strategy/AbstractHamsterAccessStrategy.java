package com.labs.dm.hamster.cache.strategy;

import com.labs.dm.hamster.cache.region.HamsterTransactionalDataRegion;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.access.SoftLock;

/**
 * Created by daniel on 2015-03-25.
 */
public abstract class AbstractHamsterAccessStrategy<T extends HamsterTransactionalDataRegion> {

    private final T region;

    AbstractHamsterAccessStrategy(T region) {
        this.region = region;
    }

    protected T region() {
        return region;
    }

    public final boolean putFromLoad(Object key, Object value, long txTimestamp, Object version) throws CacheException {
        return putFromLoad(key, value, txTimestamp, version, true);
    }

    public abstract boolean putFromLoad(Object key, Object value, long txTimestamp, Object version, boolean minimalPutOverride)
            throws CacheException;

    @SuppressWarnings("UnusedDeclaration")
    public final SoftLock lockRegion() {
        return null;
    }

    @SuppressWarnings("UnusedDeclaration")
    public final void unlockRegion(SoftLock lock) throws CacheException {
        //
    }

    public void remove(Object key) throws CacheException {
    }

    @SuppressWarnings("UnusedDeclaration")
    public final void removeAll() throws CacheException {
        //region.clear();
    }

    public final void evict(Object key) throws CacheException {
        region.evict(key);
    }

    @SuppressWarnings("UnusedDeclaration")
    public final void evictAll() throws CacheException {
        region.evictAll();
    }
}
