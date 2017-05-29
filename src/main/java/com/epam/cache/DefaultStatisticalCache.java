package com.epam.cache;
import java.util.Date;
public class DefaultStatisticalCache implements StatisticalCache {
    @Override
    public Iterable<String> getKeys() {
        return null;
    }
    @Override
    public Date getLastAccess(String key) {
        return null;
    }
    @Override
    public long getNumHits(String key) {
        return 0;
    }
}
