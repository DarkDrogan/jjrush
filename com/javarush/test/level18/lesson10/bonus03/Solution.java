package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

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
        int counter = 0;
        for(String e : list){
            String number = e.substring(0, 8);
            number = number.trim();
            if(number.equals(args[1])){
                break;
            }
            counter++;
        }
        if(args[0].equals("-d")){
            String s = list.get(counter);
            list.remove(counter);
        }
        if(args[0].equals("-u")){
            String s = list.get(counter);
            int currentID = Integer.parseInt(s.substring(0, 8).trim());
            s = createString(args, currentID);
            list.set(counter, s);
        }
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, false));
        for(String e : list){
            fileWriter.write(e);
            fileWriter.write("\r\n");
            fileWriter.flush();
        }
        fileWriter.close();
    }

    private static String createString(String[] args, int lastID) {
        StringBuilder builder = new StringBuilder();
        builder.append(lastID);
        while(builder.length()<8){
            builder.append(" ");
        }
        builder.append(args[2]);
        while(builder.length()<38){
            builder.append(" ");
        }
        builder.append(args[3]);
        while(builder.length()<46){
            builder.append(" ");
        }
        builder.append(args[4]);
        while(builder.length()<50){
            builder.append(" ");
        }
        return builder.toString();
    }
}
