package designProblems.cache.client;

import designProblems.cache.Cachedata;

public class IntegerCacheClientImpl implements CacheClient<Integer, String, Cachedata> {
    @Override
    public void put(Cachedata cacheData) {
        System.out.println("IntegerCacheClient storing key: " + cacheData.getKey() +
                ", value: " + cacheData.getValue());
    }
}
