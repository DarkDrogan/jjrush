package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    private static File file;
    private static String filePath;

    public static void main(String[] args) throws IOException
    {
        List<File> fileList = new ArrayList<File>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = reader.readLine();
            if(s.equals("end")){
                break;
            }
            fileList.add(new File(s));
        }
        if(!fileList.isEmpty()){
            String [] s1 = fileList.get(0).getPath().split(".part");
            filePath = s1[0];
        }
        Collections.sort(fileList);
        FileOutputStream fos = new FileOutputStream(filePath, true);

        for(File e : fileList){
            FileInputStream fis = new FileInputStream(e);
            byte [] byteArray = new byte[fis.available()];
            int count = fis.read(byteArray);
            fos.write(byteArray);
            fos.flush();
            fis.close();
        }

        fos.close();
        reader.close();
    }
}
