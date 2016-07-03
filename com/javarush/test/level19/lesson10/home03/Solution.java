package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        File file  = new File(args[0]);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while(reader.ready()){
            String s = reader.readLine();
            String [] stringArray = s.trim().split(" ");
            String dateString = stringArray[stringArray.length - 3] + "/" + stringArray[stringArray.length - 2] + "/"
            + stringArray[stringArray.length - 1];
            Date date = sdf.parse(dateString);
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i<stringArray.length-3; i++){
                builder.append(stringArray[i] + " ");
            }
            PEOPLE.add(new Person(builder.toString().trim().replaceAll("\uFEFF", ""), date));
        }
        reader.close();
    }

}
