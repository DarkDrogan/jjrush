package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class Solution {
    private static int counter;
    private static Pattern pattern;
    private static String s;
    private static int number;

    public static void main(String[] args) throws IOException
    {
        FileInputStream stream = new FileInputStream(args[0]);
        counter = 0;
        int a = 0;
        while(stream.available()>0){
            a = stream.read();
            if((a > 64 && a < 91) || (a > 96 && a < 123)){
                counter++;
            }
        }
        System.out.println(counter);
        stream.close();
    }
}
