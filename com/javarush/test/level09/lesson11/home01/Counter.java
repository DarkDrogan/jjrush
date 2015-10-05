package com.javarush.test.level09.lesson11.home01;

/**
 * Created by drogan on 03.09.15.
 */
public class Counter
{
    String id;

    Counter(String id){
        this.id = id;
        count = 0;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    public String toString(){
        String s = "Counter id is " + id + ". Current count: " + count + ".";
        return s;
    }

    public void printToString(){
        System.out.println(toString());
    }

    private int count;
}
