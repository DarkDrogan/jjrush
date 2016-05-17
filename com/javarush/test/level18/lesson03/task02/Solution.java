package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    private static int minByte = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        while(stream.available() > 0){
            int data = stream.read();
            if(data < minByte) minByte = data;
        }
        reader.close();
        stream.close();
        System.out.println(minByte);
    }
}
