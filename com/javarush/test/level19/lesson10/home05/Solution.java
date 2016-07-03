package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        File file1 = new File(args[0]);
        File file2 = new File(args[1]);
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        while(reader.ready()){
            String s = reader.readLine().replaceAll("\uFEFF", "");
            String [] stringArray = s.split(" ");
            for(String e : stringArray) {
                if (e.matches(".*\\d.*")) {
                    writer.write(e + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
