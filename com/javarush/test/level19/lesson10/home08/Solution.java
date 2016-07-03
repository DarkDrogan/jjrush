package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(consoleReader.readLine());
        consoleReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while(reader.ready()){
            StringBuilder builder = new StringBuilder(reader.readLine());
            builder.reverse();
            System.out.println(builder.toString());
        }
        reader.close();
    }
}
