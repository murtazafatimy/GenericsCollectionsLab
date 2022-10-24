package edu.sdccd.cisc191;

public class ArrayProducer {

    String[] array;

    public ArrayProducer(String[] someArray){
        array = someArray;
    }

    public void produce(int index, String someString){
        array[index] = someString;
    }
}
