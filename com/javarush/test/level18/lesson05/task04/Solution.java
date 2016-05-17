package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();

        FileInputStream file1 = new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);

        int count = file1.available();
        byte[] ext = new byte[count];

        while (file1.available() > 0){
            file1.read(ext);
        }

        for (int i = count - 1; i >= 0 ; i--)
        {
            file2.write(ext[i]);
        }

        file1.close();
        file2.close();

    }
}
