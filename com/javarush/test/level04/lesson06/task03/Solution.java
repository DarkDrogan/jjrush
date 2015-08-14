package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //input three int
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer x[] = new Integer[3];
        x[0] = Integer.parseInt(reader.readLine());
        x[1] = Integer.parseInt(reader.readLine());
        x[2] = Integer.parseInt(reader.readLine());

        sort(x, Collections.reverseOrder());

        for (int i = 0; i < 3; i++)
            System.out.println(x[i]);
    }
}
