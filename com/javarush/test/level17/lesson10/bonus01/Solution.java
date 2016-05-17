package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if(args[0].equals("-c")){
            createPerson(args);
        }else if(args[0].equals("-u")){
            updatePerson(args);
        }else if(args[0].equals("-d")){
            deletePerson(args);
        }else if(args[0].equals("-i")){
            infoPerson(args);
        }
    }

    public static Sex parseSex(String s) {
        if ("м".equals(s)) return Sex.MALE;
        if ("ж".equals(s)) return Sex.FEMALE;
        return null;
    }

    public static String parseSex(Sex s) {
        if (Sex.MALE.equals(s)) return "м";
        if (Sex.FEMALE.equals(s)) return "ж";
        return null;
    }


    private static void infoPerson(String[] arg)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = allPeople.get(Integer.parseInt(arg[1]));

        System.out.println(arg[1] + ": " + person.getName() + " " + parseSex(person.getSex()) + " " + dateFormat.format(person.getBirthDay()));
    }

    private static void deletePerson(String[] arg)
    {
        if (Integer.parseInt(arg[1]) < allPeople.size()) {
            Person p = allPeople.get(Integer.parseInt(arg[1]));
            p.setName(null);
            p.setSex(null);
            p.setBirthDay(null);
        }

    }

    private static void updatePerson(String[] arg)
    {

        if (Integer.parseInt(arg[1])<allPeople.size())
        {
            SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            if (Integer.parseInt(arg[1])<allPeople.size())
            {
                Person person = allPeople.get(Integer.parseInt(arg[1]));
                try
                {
                    Date a = simpleFormat.parse(arg[4]);
                person.setBirthDay(a);
                }
                catch (ParseException e)
                {
                    e.printStackTrace();
                }

                person.setSex(parseSex(arg[3]));
                person.setName(arg[2]);
            }
        }
    }

    private static void createPerson(String[] arg)
    {
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try
        {
            Date a = simpleFormat.parse(arg[3]);

        boolean isAdded = false;
        if(arg[2].equals("м")){
            Person person = Person.createMale(arg[1], a);
            isAdded = allPeople.add(person);
            if(isAdded){
                System.out.println(allPeople.indexOf(person));
            }
        }else if(arg[2].equals("ж")) {
            Person person = Person.createFemale(arg[1], a);
            isAdded = allPeople.add(person);
            if (isAdded)
            {
                System.out.println(allPeople.indexOf(person));
            }
        }
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
