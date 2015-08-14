package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("igor", 17, "BakerStreet");
        Man man2 = new Man("igorast", 17, "BakerStreet");
        Woman woman1 = new Woman("alla", 18, "FuckedStr");
        Woman woman2 = new Woman("Lis", 19, "Kirovsk");

        System.out.println(toString(man1));
        System.out.println(toString(man2));
        System.out.println(toString(woman1));
        System.out.println(toString(woman2));
    }

    private static String toString(Man man){

        return man.name + " " + man.age + " " + man.address;
    }

    private static String toString(Woman woman){

        return woman.name + " " + woman.age + " " + woman.address;
    }

    public static class Man{

        String name;

        int age;

        String address;

        public Man(String name){

            this.name = name;

        }

        public Man(String name, int age){

            this.name = name;
            this.age = age;

        }

        public Man(String name, int age, String address){

            this.name = name;
            this.age = age;
            this.address = address;

        }

        public Man(int age, String address){

            this.address = address;
            this.age = age;

        }

    }

    public static class Woman{

        String name;

        int age;

        String address;

        public Woman(String name){
            this.name = name;

        }

        public Woman(String name, int age){

        }

        public Woman(String name, int age, String address){
           this.name = name;
            this.address = address;
            this.age = age;
        }

        public Woman(int age, String address){

        }
    }
}
