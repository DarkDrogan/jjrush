package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    private static FileInputStream fis;
    private static FileOutputStream fos;
    private static int x;

    public static void main(String[] args) throws IOException{
        if(args.length == 3){
            if(args[0].equals("-e")){
                encryption(args);
            }
            if(args[0].equals("-d")){
                decoding(args);
            }
        }
    }

    private static void decoding(String[] args) throws IOException
    {
        fis = new FileInputStream(args[1]);
        fos = new FileOutputStream(args[2]);
        while(fis.available()>0){
            x = fis.read();
            x++;
            fos.write(x);
        }
        fis.close();
        fos.close();
    }

    private static void encryption(String[] args) throws IOException
    {
        fis = new FileInputStream(args[1]);
        fos = new FileOutputStream(args[2]);
        while(fis.available()>0){
            x = fis.read();
            x--;
            fos.write(x);
        }
        fis.close();
        fos.close();
    }

}
