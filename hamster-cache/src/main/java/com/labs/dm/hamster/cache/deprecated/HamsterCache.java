package com.labs.dm.hamster.cache.deprecated;


import org.hibernate.Cache;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by daniel on 2015-02-25.
 */
public class HamsterCache implements Cache {

    private final String regionName;
    private final HashMap map = new HashMap();

    public HamsterCache(String regionName) {

        this.regionName = regionName;
    }

    @Override
    public boolean containsEntity(Class entityClass, Serializable identifier) {
        return false;
    }

    @Override
    public boolean containsEntity(String entityName, Serializable identifier) {
        return false;
    }

    @Override
    public void evictEntity(Class entityClass, Serializable identifier) {

    }

    @Override
    public void evictEntity(String entityName, Serializable identifier) {

    }

    @Override
    public void evictEntityRegion(Class entityClass) {

    }

    @Override
    public void evictEntityRegion(String entityName) {

    }

    @Override
    public void evictEntityRegions() {

    }

    @Override
    public void evictNaturalIdRegion(Class naturalIdClass) {

    }

    @Override
    public void evictNaturalIdRegion(String naturalIdName) {

    }

    @Override
    public void evictNaturalIdRegions() {

    }

    @Override
    public boolean containsCollection(String role, Serializable ownerIdentifier) {
        return false;
    }

    @Override
    public void evictCollection(String role, Serializable ownerIdentifier) {

    }

    @Override
    public void evictCollectionRegion(String role) {

    }

    @Override
    public void evictCollectionRegions() {

    }

    @Override
    public boolean containsQuery(String regionName) {
        return false;
    }

    @Override
    public void evictDefaultQueryRegion() {

    }

    @Override
    public void evictQueryRegion(String regionName) {

    }

    @Override
    public void evictQueryRegions() {

    }

    @Override
    public void evictAllRegions() {

    }
}
