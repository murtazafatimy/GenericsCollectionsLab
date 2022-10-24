package edu.sdccd.cisc191;

public class ArrayConsumer {

    String[] array;

    public ArrayConsumer(String[] someArray){
        array = someArray;
    }

    public String consume(){
        String removed;

        if(array[0] == null){
            removed = array[1];
            array[1] = null;
        } else{
            removed = array[0];
            array[0] = null;
        }
        return removed;
    }
}