package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String aName1 = reader.readLine();
        String aName2 = reader.readLine();

        if (aName1.equals(aName2))
            System.out.println("Имена идентичны");
        else if (aName1.length() == aName2.length())
            System.out.println("Длины имен равны");
    }
}
