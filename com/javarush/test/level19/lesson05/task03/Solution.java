package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        String s = "";
        while(fileReader.ready()){
            int data = fileReader.read();
            s += String.valueOf((char)data);
        }
        String[] x = s.trim().split(" ");
        for(String e : x){
            try{
                int i = Integer.parseInt(e);
                fileWriter.write(e + " ");
            }catch (Exception z){

            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
