package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer
{
    private ArrayList<String> list;

    public ArrayListProducer(ArrayList<String> someArrayList){
        list = someArrayList;
    }

    public void produce(int i, String someString){
        list.add(i , someString);
    }

}
