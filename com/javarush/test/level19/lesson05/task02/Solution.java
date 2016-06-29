package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        while(fileReader.ready()){
            builder.append((char)fileReader.read());
        }
        String [] s = builder.toString().replaceAll("[^a-zA-Z0-9]"," ").split(" ");
        int counter = 0;
        for(String e : s){
            if(e.equals("world")){
                counter++;
            }
        }
        System.out.println(counter);
        fileReader.close();
    }
}
