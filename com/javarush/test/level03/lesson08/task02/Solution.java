package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aName = reader.readLine();
        int aWige = Integer.parseInt(reader.readLine());
        int aYear = Integer.parseInt(reader.readLine());
        System.out.println(aName + " получает " + aWige + " через " + aYear + " лет.");

    }
}