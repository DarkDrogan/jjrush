package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1, x2, x3, x4;
        x1 = Integer.parseInt(reader.readLine());
        x2 = Integer.parseInt(reader.readLine());
        x3 = Integer.parseInt(reader.readLine());
        x4 = Integer.parseInt(reader.readLine());

        System.out.println(min(min(x1, x2), min(x3, x4)));

    }

    private static int min(int a, int b)
    {
        if (a < b)
            return b;
        else
            return a;
    }
}
