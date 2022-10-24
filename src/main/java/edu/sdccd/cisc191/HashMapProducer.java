package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapProducer {

    private HashMap<String, String> map;

    public HashMapProducer(HashMap<String, String> someHashMap){
        map = someHashMap;
    }

    public void produce(String key, String value){
        map.put(key, value);
    }
}