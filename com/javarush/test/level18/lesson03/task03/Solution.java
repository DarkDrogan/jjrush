package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        while(stream.available()>0){
            a = stream.read();
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
        }
        a = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            int x = pair.getValue();
            if(x > a) a = x;
        }
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            int x = pair.getValue();
            if(x == a) System.out.print(pair.getKey() + " ");
        }
        reader.close();
        stream.close();
    }
}
