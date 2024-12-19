package designProblems.cache.client;

import designProblems.cache.Cachedata;
import designProblems.cache.put.CacheProxy;
import designProblems.cache.put.CacheProxyMapImpl;

public class MapCacheClientImpl implements CacheClient<String, String, Cachedata> {

    @Override
    public void put(Cachedata caheData) {
        // TODO Auto-generated method stub
        CacheProxy cacheProxyMapImpl = new CacheProxyMapImpl();
        cacheProxyMapImpl.put(caheData.getKey().toString(), caheData.getValue().toString());
    }

}
