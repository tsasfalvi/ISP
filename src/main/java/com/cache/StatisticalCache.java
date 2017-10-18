package com.cache;
import java.util.Date;

public interface StatisticalCache {
    Iterable<String> getKeys();

    Date getLastAccess(String key);

    long getNumHits(String key);
}
