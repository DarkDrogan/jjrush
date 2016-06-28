package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("-c") && args.length == 4) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File fileName = new File(reader.readLine());
            reader.close();
            if(!fileName.exists()){
                fileName.createNewFile();
            }
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            List<String> list = new ArrayList<String>();
            while(fileReader.ready()){
                list.add(fileReader.readLine());
            }
            fileReader.close();
            String currentLastString = list.get(list.size()-1).substring(0, 8);
            currentLastString = currentLastString.trim();
            int lastID = Integer.parseInt(currentLastString) + 1;
            String lastString = createString(args, lastID);
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
            fileWriter.write("\r\n");
            fileWriter.write(lastString);
            fileWriter.flush();
            fileWriter.close();

        }
    }

    private static String createString(String[] args, int lastID) {
        StringBuilder builder = new StringBuilder();
        builder.append(lastID);
        while(builder.length()<8){
            builder.append(" ");
        }
        builder.append(args[1]);
        while(builder.length()<38){
            builder.append(" ");
        }
        builder.append(args[2]);
        while(builder.length()<46){
            builder.append(" ");
        }
        builder.append(args[3]);
        while(builder.length()<50){
            builder.append(" ");
        }
        return builder.toString();
    }
}
