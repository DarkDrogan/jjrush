package com.javarush.test.level17.lesson10.bonus02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    private static Person person;
    private static SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {

        //start here - начни тут
        if(args[0].equals("-c")){
            createPerson(args);
        }
        if(args[0].equals("-u")){
            update(args);
        }
        if(args[0].equals("-d")){
            delete(args);
        }
        if(args[0].equals("-i")){
            info(args);
        }
    }

    private static synchronized void info(String[] args)
    {
        for(int i = 1; i < args.length; i++){
            System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");
            if(allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) System.out.print("м ");
            if(allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.FEMALE)) System.out.print("ж ");
            System.out.println(formatOut.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
        }
    }

    private static synchronized void delete(String[] args)
    {
        for(int i = 1; i < args.length; i++)
        {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
        }
    }

    private static synchronized void update(String[] args) throws ParseException
    {
        for(int i = 1 ; i < args.length; i += 4){
            switch (args[i+2]){
                case "м": allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE); break;
                case "ж": allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE); break;
            }
            allPeople.get(Integer.parseInt(args[i])).setBirthDay(formatIn.parse(args[i+3]));
            allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
        }
    }

    private static synchronized void createPerson(String[] args) throws ParseException
    {

        for(int i = 1; i < args.length; i+=3){
            switch (args[i+1]){
                case "м": allPeople.add(Person.createMale(args[i], formatIn.parse(args[i+2]))); break;
                case "ж": allPeople.add(Person.createFemale(args[i], formatIn.parse(args[i+2]))); break;
            }
            System.out.println(allPeople.size()-1);
        }
    }
}