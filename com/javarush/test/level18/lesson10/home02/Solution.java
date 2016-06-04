package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    private static String fileName;
    private static long counter = 0;
    private static long spaceCounter = 0;

    public static void main(String[] args) throws IOException
    {
        if(args.length != 0 && args.length < 2){
            fileName = args[0];
            testMethod(fileName);
        }
    }

    private static void testMethod(String fileName) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while(fileInputStream.available()>0){
            counter++;
            if(fileInputStream.read() == 32){
                spaceCounter++;
            }
        }
        double ratio = (double) spaceCounter/counter * 100;
        System.out.printf(Locale.ENGLISH, "%.2f", ratio);
        fileInputStream.close();
    }
}
