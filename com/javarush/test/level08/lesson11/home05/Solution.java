package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //for Serafimko... I don't understand, why are u using trim(); =)

        List<Character> list = new ArrayList<Character>();
        char [] x = s.toCharArray();
        for (Character e : x)
            list.add(e);
        //first symbol we need toUpperCase always
        list.set(0, Character.toUpperCase(list.get(0)));

        for(int i = 0; i < list.size()-1;i++)
        {
            //i can't do anything. if i do "==" or ".equals" then it is wrong
            if(list.get(i)!=' ')
                //we escape if all is alright
                continue;
            else
            {
                //we upper the next symbol
                list.set(i+1, Character.toUpperCase(list.get(i+1)));
            }

        }

        //we clear string
        s = "";

        //we're casting char toString
        for(Character e : list)
        {
            s += e;
        }

        //print string
        System.out.println(s);

    }


}
