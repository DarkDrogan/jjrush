package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fReader = new FileReader(reader.readLine());
        FileWriter fWriter = new FileWriter(reader.readLine());
        reader.close();
        int counter = 0;
        while(fReader.ready()){
            int data = fReader.read();
            if(counter++ % 2 == 1){
                fWriter.write(data);
            }
        }
        fReader.close();
        fWriter.close();
    }
}
