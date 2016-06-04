package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream fis1 = new FileInputStream(fileName);
        FileInputStream fis2 = new FileInputStream(fileName2);
        byte [] byteArray = new byte[fis1.available()];
        byte [] byteArray1 = new byte[fis2.available()];
        if(fis1.available()>0){
            fis1.read(byteArray);
        }
        if(fis2.available()>0){
            fis2.read(byteArray1);
        }
        fis1.close();
        fis2.close();
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(byteArray1);
        fos.flush();
        fos.close();
        FileOutputStream fos1 = new FileOutputStream(fileName, true);
        fos1.write(byteArray);
        fos1.flush();
        fos1.close();
        reader.close();
    }
}
