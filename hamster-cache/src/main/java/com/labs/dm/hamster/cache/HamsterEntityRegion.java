package com.labs.dm.hamster.cache;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.hibernate.cache.spi.access.SoftLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author daniel
 */
public class HamsterEntityRegion implements EntityRegion {

    private final static Logger logger = LoggerFactory.getLogger(HamsterEntityRegion.class);

    @Override
    public EntityRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        return new EntityRegionAccessStrategy() {

            @Override
            public EntityRegion getRegion() {
                return new HamsterEntityRegion();
            }

            @Override
            public boolean insert(Object key, Object value, Object version) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public boolean afterInsert(Object key, Object value, Object version) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public boolean update(Object key, Object value, Object currentVersion, Object previousVersion) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public boolean afterUpdate(Object key, Object value, Object currentVersion, Object previousVersion, SoftLock lock) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public Object get(Object key, long txTimestamp) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version, boolean minimalPutOverride) throws CacheException {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public SoftLock lockItem(Object key, Object version) throws CacheException {
                logger.warn("Not supported yet!");
                return new SoftLock() {
                };
            }

            @Override
            public SoftLock lockRegion() throws CacheException {
                logger.warn("Not supported yet!");
                return new SoftLock() {
                };
            }

            @Override
            public void unlockItem(Object key, SoftLock lock) throws CacheException {
                logger.warn("Not supported yet!");
            }

            @Override
            public void unlockRegion(SoftLock lock) throws CacheException {
                logger.warn("Not supported yet!");
            }

            @Override
            public void remove(Object key) throws CacheException {
                logger.warn("Not supported yet!");
            }

            @Override
            public void removeAll() throws CacheException {
                logger.warn("Not supported yet!");
            }

            @Override
            public void evict(Object key) throws CacheException {
                logger.warn("Not supported yet!");
            }

            @Override
            public void evictAll() throws CacheException {
                logger.warn("Not supported yet!");
            }
        };
    }

    @Override
    public boolean isTransactionAware() {
        logger.warn("Not supported yet!");
        return false;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return new CacheDataDescription() {

            @Override
            public boolean isMutable() {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public boolean isVersioned() {
                logger.warn("Not supported yet!");
                return false;
            }

            @Override
            public Comparator getVersionComparator() {
                return new Comparator() {

                    @Override
                    public int compare(Object o1, Object o2) {
                        logger.warn("Not supported yet!");
                        return 0;
                    }
                };
            }
        };
    }

    @Override
    public String getName() {
        logger.warn("Not supported yet!");
        return "foo";
    }

    @Override
    public void destroy() throws CacheException {
        logger.warn("Not supported yet!");
    }

    @Override
    public boolean contains(Object key) {
        logger.warn("Not supported yet!");
        return false;
    }

    @Override
    public long getSizeInMemory() {
        logger.warn("Not supported yet!");
        return 0;
    }

    @Override
    public long getElementCountInMemory() {
        logger.warn("Not supported yet!");
        return 0;
    }

    @Override
    public long getElementCountOnDisk() {
        logger.warn("Not supported yet!");
        return 0;
    }

    @Override
    public Map toMap() {
        logger.warn("Not supported yet!");
        return new HashMap();
    }

    @Override
    public long nextTimestamp() {
        logger.warn("Not supported yet!");
        return 0;
    }

    @Override
    public int getTimeout() {
        return 60;
    }

}
