package designProblems.cache;

import java.util.HashSet;
import java.util.Set;

import designProblems.cache.client.CacheClient;
import designProblems.cache.client.IntegerCacheClientImpl;
import designProblems.cache.client.MapCacheClientImpl;
import designProblems.cache.client.MapCacheClientV2Impl;

public class Cachehandler {

    public static void main(String[] args) {
        Cachedata cacheData = new Cachedata();
        cacheData.setKey("1");
        cacheData.setValue("2");

        // Use a Set with wildcard type for CacheClient
        Set<CacheClient<?, ?, Cachedata>> cacheClients = new HashSet<>();

        // Add different CacheClient implementations
        cacheClients.add(new MapCacheClientImpl());
        cacheClients.add(new MapCacheClientV2Impl());
        cacheClients.add(new IntegerCacheClientImpl());

        // Iterate and put cache data into each client
        for (CacheClient<?, ?, Cachedata> client : cacheClients) {
            client.put(cacheData);
        }
    }

    // private final Set<CacheClient<T, U, Cachedata>> cacheClients = new HashSet<>();

    // public void addCacheClient(CacheClient<T, U, Cachedata> client) {
    //     cacheClients.add(client);
    // }

    // public void handle(Cachedata cacheData) {
    //     for (CacheClient<T, U, Cachedata> client : cacheClients) {
    //         client.put(cacheData);
    //     }
    // }

    // public static void main(String[] args) {
    //     Cachedata cacheData = new Cachedata();
    //     cacheData.setKey("1");
    //     cacheData.setValue("2");

    //     // Example with specific types
    //     Cachehandler<String, String> handler = new Cachehandler<>();
    //     handler.addCacheClient(new MapCacheClientImpl());
    //     handler.addCacheClient(new MapCacheClientV2Impl());
    //    // handler.addCacheClient(new IntegerCacheClientImpl());

    //     // Uncomment for a type mismatch error example
    //     // handler.addCacheClient(new IntegerCacheClientImpl());  // Compilation error

    //     handler.handle(cacheData);
    // }

}
