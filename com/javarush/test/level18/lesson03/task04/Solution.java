package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    private static int count;
    private static Map<Integer, Integer> counter = new HashMap<Integer, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        while(stream.available()>0){
            count = stream.read();
            if(counter.containsKey(count)){
                counter.put(count, counter.get(count)+1);
            }else{
                counter.put(count, 1);
            }
        }
        count = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> party : counter.entrySet()){
            int x = party.getValue();
            if(count > x) count = party.getValue();
        }
        for(Map.Entry<Integer, Integer> party : counter.entrySet()){
            if(party.getValue() == count){
                System.out.print(party.getKey());
                System.out.print(" ");
            }
        }
        reader.close();
        stream.close();
    }
}
