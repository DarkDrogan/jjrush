package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    private static String file2;
    private static String file3;
    private static int allCount, file2Count, file3Count;
    static byte [] file1Buffer;
    static byte [] file2Buffer;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        file2 = reader.readLine();
        file3 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);
        allCount = inputStream.available();
        file2Buffer = new byte[allCount/2];
        if(allCount%2 == 1){
            file1Buffer = new byte[allCount/2+1];
            file2Count = allCount/2+1;
        }else{
            file1Buffer = new byte[allCount/2];
            file2Count = allCount/2;
        }

        while(inputStream.available()>0){
            int count = inputStream.read(file1Buffer);
            outputStream.write(file1Buffer, 0, file2Count);
            count = inputStream.read(file2Buffer);
            outputStream2.write(file2Buffer, 0, allCount/2);
        }
        reader.close();
        inputStream.close();
        outputStream.close();
        outputStream2.close();
    }
}
