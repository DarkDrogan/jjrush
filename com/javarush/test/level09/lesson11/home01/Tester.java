package com.javarush.test.level09.lesson11.home01;

/**
 * Created by drogan on 03.09.15.
 */
public class Tester
{
    public static void main(String[] args){
        Counter counter = new Counter("rex");
        Counter counter1 = new Counter("specialForce");

        counter.increment();
        counter.increment();
        for(int i = 0; i < 17; i++)
            counter1.increment();

        System.out.println("Special faster method print:");
        counter.printToString();
        counter1.printToString();

        System.out.println();
        System.out.println("Standart method \"toString\":");
        System.out.println(counter1.toString());
        System.out.println(counter.toString());
        System.out.println(counter.id);
        System.out.println(counter.tally());
    }
}
