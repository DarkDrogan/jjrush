package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные
 одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{
        public static Scanner scanner;

        public PersonScannerAdapter(Scanner sc)
        {
            scanner = sc;
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }

        @Override
        public Person read() throws IOException
        {
            String s = scanner.nextLine();
            String [] s1 = s.split(" ");
            Date date = new Date();
            s = s1[3] + " " + s1[4] + " " + s1[5];
            try
            {
                date = createDate(s);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            return new Person(s1[1], s1[2], s1[0], date);
        }

        private Date createDate(String s)throws ParseException{
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            return sdf.parse(s);
        }
    }
}
