package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.spi.QueryResultsRegion;

import java.util.Properties;

/**
 * Created by daniel on 2015-03-23.
 */
public class HamsterQueryResultsRegion extends HamsterGeneralDataRegion implements QueryResultsRegion {

    public HamsterQueryResultsRegion(String regionName, Properties properties) {
        super(regionName, null, properties);
    }
}
