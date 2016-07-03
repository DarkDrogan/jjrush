package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<String, Double>();
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        while(reader.ready()){
            String s =  reader.readLine().trim();
            String [] sA1 = s.split(" ");
            String name = sA1[0].replaceAll("\uFEFF", "");
            if(!map.containsKey(name)){
                map.put(name, Double.parseDouble(sA1[1]));
            }else{
                map.put(name, Double.parseDouble(sA1[1])+map.get(name));
            }
        }
        reader.close();

        double maximum = Double.MIN_VALUE;
        for (Map.Entry<String, Double> pair : map.entrySet())
        {
            if(pair.getValue() > maximum){
                maximum = pair.getValue();
            }
        }

        for (Map.Entry<String, Double> pair : map.entrySet())
        {
            if(pair.getValue() == maximum){
                System.out.println(pair.getKey());
            }
        }
    }
}
