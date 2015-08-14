package com.javarush.test.level01.lesson04.task02;

import java.lang.String;

/* Когда я вырасту, то хочу быть паровым экскаватором!
Напиши программу, которая выводит на экран надпись: «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String a = "Когда я вырасту, то хочу быть паровым экскаватором!";
        print5Times(a);
        print5Times(a);
    }


    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
