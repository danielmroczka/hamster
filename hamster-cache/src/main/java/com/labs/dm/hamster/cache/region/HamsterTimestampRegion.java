package com.labs.dm.hamster.cache.region;

import org.hibernate.cache.spi.TimestampsRegion;

import java.util.Properties;

/**
 * Created by daniel on 2015-03-23.
 */
public class HamsterTimestampRegion extends HamsterGeneralDataRegion implements TimestampsRegion {
    public HamsterTimestampRegion(String regionName, Properties properties) {
        super(regionName, null, properties);
    }


}
