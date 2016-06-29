package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(reader1.readLine());
        FileWriter writer = new FileWriter(reader1.readLine());
        reader1.close();

        while (reader.ready())
        {
            int data = reader.read();
            if(data == 46){
                data = 33;
            }
            writer.write(data);
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
