package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    private static  FileInputStream streamReader;
    private static List<Integer> listCharacter;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        streamReader = new FileInputStream(reader.readLine());
        listCharacter = new LinkedList<Integer>();
        while(streamReader.available()>0){
            int a = streamReader.read();
            if(listCharacter.contains(a)){
                continue;
            }
            listCharacter.add(a);
        }
        reader.close();
        streamReader.close();
        Collections.sort(listCharacter);
        for(int e : listCharacter){
            System.out.print(e);
            System.out.print(" ");
        }
    }
}
