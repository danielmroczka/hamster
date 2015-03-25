package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.QueryResultsRegion;

import java.util.Properties;

/**
 * Created by daniel on 2015-03-23.
 */
public class HamsterQueryResultsRegion extends GeneralDataHamsterRegion implements QueryResultsRegion {

    public HamsterQueryResultsRegion(String regionName, CacheDataDescription metadata, Properties properties) {
        super(regionName, metadata, properties);
    }
}
