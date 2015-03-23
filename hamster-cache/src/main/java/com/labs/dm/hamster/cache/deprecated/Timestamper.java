package com.labs.dm.hamster.cache.deprecated;

/**
 * Created by daniel on 2015-02-25.
 */

public final class Timestamper {
    private static final int BIN_DIGITS = 12;
    public static final short ONE_MS = 1 << BIN_DIGITS;
    private static short counter = 0;
    private static long time;

    private Timestamper() {
    }

    public static long next() {
        synchronized (Timestamper.class) {
            long newTime = System.currentTimeMillis() << BIN_DIGITS;
            if (time < newTime) {
                time = newTime;
                counter = 0;
            } else if (counter < ONE_MS - 1) {
                counter++;
            }

            return time + counter;
        }
    }
}

