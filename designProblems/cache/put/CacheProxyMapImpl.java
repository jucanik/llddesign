package designProblems.cache.put;

import java.util.HashMap;
import java.util.Map;

public class CacheProxyMapImpl implements CacheProxy<String, String> {

    @Override
    public void put(String key, String value) {
        // TODO Auto-generated method stub
        Map<String, String> mp = new HashMap<>();
        mp.put(key, value);
        System.out.println("cache map is"+ mp);
    }

}
