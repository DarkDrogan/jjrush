package com.javarush.test.level01.lesson08.task03;

/* Слава Роботам!
Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String a = "Слава Роботам! Убить всех человеков!";

        print4Times(a);
        print4Times(a);
        print4Times(a);
        print4Times(a);
    }

    public static void print4Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
