package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {

    private HashMap<String, String> map;

    public HashMapConsumer(HashMap<String, String> someHashMap){
        map = someHashMap;
    }

    public String consume(String string){
        return map.get(string);
    }
}