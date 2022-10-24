package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetConsumer {

    private HashSet<String> set;

    public HashSetConsumer(HashSet<String> someHashSet){
        set = someHashSet;
    }

    public boolean consume(String someElement) {
        return set.remove(someElement);
    }
}
