package designProblems.cache.client;

import designProblems.cache.Cachedata;
import designProblems.cache.Cachedatav2;
import designProblems.cache.put.CacheProxy;
import designProblems.cache.put.CacheProxyMapImpl;

public class MapCacheClientV2Impl implements CacheClient<String, String, Cachedata> {
    @Override
    public void put(Cachedata cacheData) {
        System.out.println("AnotherCacheClient storing key: " + cacheData.getKey() + 
                           ", value: " + cacheData.getValue());
    }
}
