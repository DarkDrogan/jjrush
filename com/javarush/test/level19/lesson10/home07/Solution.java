package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file1 = new File(args[0]);
        File file2 = new File(args[1]);
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        StringBuilder builder = new StringBuilder();
        while(reader.ready()){
            String s = reader.readLine();
            String [] stringArray = s.replaceAll("\uFEFF", "").split(" ");
            for (String e : stringArray){
                if(e.length() > 6){
                    builder.append(e + ",");
                }
            }
        }
        writer.write(builder.substring(0, builder.toString().length()-1));
        writer.close();
        reader.close();
    }
}
