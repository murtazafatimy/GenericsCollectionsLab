package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {

    private HashSet<String> set;

    public HashSetProducer(HashSet<String> someHashSet){
        set = someHashSet;
    }

    public boolean produce(String someElement) {
        return set.add(someElement);
    }
}