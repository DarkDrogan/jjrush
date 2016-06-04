package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream in = new FileInputStream(file2);
        FileOutputStream out = new FileOutputStream(file1);
        byte[] buffer = new byte[in.available()];
        while (in.available() > 0) {
            int count = in.read(buffer);
            out.write(buffer, 0 , count);
        }
        FileInputStream in2 = new FileInputStream(file3);
        out = new FileOutputStream(file1, true);
        buffer = new byte[in2.available()];
        while (in2.available() > 0) {
            int count = in2.read(buffer);
            out.write(buffer, 0, count);
        }
        in2.close();
        in.close();
        out.close();
        reader.close();
    }
}
