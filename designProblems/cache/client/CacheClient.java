package designProblems.cache.client;

public interface CacheClient<CacheKey, CacheValue, CacheData> {
    void put(CacheData cacaheData);
}
