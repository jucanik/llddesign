package designProblems.cache.put;

public interface CacheProxy<CacheKey, CacheValue> {
    void put(CacheKey key, CacheValue value);
}

