package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.EntityRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.hibernate.cache.spi.access.SoftLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author daniel
 */
public class HamsterEntityRegion implements EntityRegion {

    private final static Logger logger = LoggerFactory.getLogger(HamsterEntityRegion.class);

    private final String regionName;

    public HamsterEntityRegion(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public EntityRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        return new EntityRegionAccessStrategy() {

            @Override
            public EntityRegion getRegion() {
                return new HamsterEntityRegion(regionName);
            }

            @Override
            public boolean insert(Object key, Object value, Object version) throws CacheException {
                logger.warn("insert not supported yet!");
                return true;
            }

            @Override
            public boolean afterInsert(Object key, Object value, Object version) throws CacheException {
                logger.warn("afterInsert not supported yet!");
                return true;
            }

            @Override
            public boolean update(Object key, Object value, Object currentVersion, Object previousVersion) throws CacheException {
                logger.warn("update not supported yet!");
                return true;
            }

            @Override
            public boolean afterUpdate(Object key, Object value, Object currentVersion, Object previousVersion, SoftLock lock) throws CacheException {
                logger.warn("afterUpdate not supported yet!");
                return true;
            }

            @Override
            public Object get(Object key, long txTimestamp) throws CacheException {
                logger.warn("get not supported yet!");
                /*return new CacheEntry() {

                    @Override
                    public boolean isReferenceEntry() {
                        return false;
                    }

                    @Override
                    public String getSubclass() {
                        return "com.labs.dm.hamster.example.domain.Person";
                    }

                    @Override
                    public Object getVersion() {
                        return "";
                    }

                    @Override
                    public boolean areLazyPropertiesUnfetched() {
                        return false;
                    }

                    @Override
                    public Serializable[] getDisassembledState() {
                        return new Serializable[1];
                    }
                };*/

                return new Serializable() {
                };
            }

            @Override
            public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version) throws CacheException {
                logger.warn("putFromLoad not supported yet!");
                return false;
            }

            @Override
            public boolean putFromLoad(Object key, Object value, long txTimestamp, Object version, boolean minimalPutOverride) throws CacheException {
                logger.warn("putFromLoad not supported yet!");
                return false;
            }

            @Override
            public SoftLock lockItem(Object key, Object version) throws CacheException {
                logger.warn("lockItem not supported yet!");
                return new SoftLock() {
                };
            }

            @Override
            public SoftLock lockRegion() throws CacheException {
                logger.warn("lockRegion not supported yet!");
                return new SoftLock() {
                };
            }

            @Override
            public void unlockItem(Object key, SoftLock lock) throws CacheException {
                logger.warn("unlockItem not supported yet!");
            }

            @Override
            public void unlockRegion(SoftLock lock) throws CacheException {
                logger.warn("unlockRegion not supported yet!");
            }

            @Override
            public void remove(Object key) throws CacheException {
                logger.warn("remove not supported yet!");
            }

            @Override
            public void removeAll() throws CacheException {
                logger.warn("removeAll not supported yet!");
            }

            @Override
            public void evict(Object key) throws CacheException {
                logger.warn("evict not supported yet!");
            }

            @Override
            public void evictAll() throws CacheException {
                logger.warn("evictAll not supported yet!");
            }
        };
    }

    @Override
    public boolean isTransactionAware() {
        logger.warn("isTransactionAware not supported yet!");
        return false;
    }

    @Override
    public CacheDataDescription getCacheDataDescription() {
        return new CacheDataDescription() {

            @Override
            public boolean isMutable() {
                logger.warn("isMutable not supported yet!");
                return false;
            }

            @Override
            public boolean isVersioned() {
                logger.warn("isVersioned not supported yet!");
                return false;
            }

            @Override
            public Comparator getVersionComparator() {
                return new Comparator() {

                    @Override
                    public int compare(Object o1, Object o2) {
                        logger.warn("compare not supported yet!");
                        return 0;
                    }
                };
            }
        };
    }

    @Override
    public String getName() {
        logger.warn("getName not supported yet!");
        return regionName;
    }

    @Override
    public void destroy() throws CacheException {
        logger.warn("destroy not supported yet!");
    }

    @Override
    public boolean contains(Object key) {
        logger.warn("contains not supported yet!");
        return false;
    }

    @Override
    public long getSizeInMemory() {
        logger.warn("getSizeInMemory not supported yet!");
        return 0;
    }

    @Override
    public long getElementCountInMemory() {
        logger.warn("getElementCountInMemory not supported yet!");
        return 0;
    }

    @Override
    public long getElementCountOnDisk() {
        logger.warn("getElementCountOnDisk not supported yet!");
        return 0;
    }

    @Override
    public Map toMap() {
        logger.warn("toMap not supported yet!");
        return new HashMap();
    }

    @Override
    public long nextTimestamp() {
        logger.warn("nextTimestamp not supported yet!");
        return 0;
    }

    @Override
    public int getTimeout() {
        return 60;
    }

}