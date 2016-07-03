package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream modifyStream = new PrintStream(byteArray);
        System.setOut(modifyStream);
        testString.printSomething();
        String[] stringArray = byteArray.toString().split(" ");
        String s = byteArray.toString().trim() + " " + executeMath(stringArray);
        System.setOut(consoleStream);
        System.out.println(s);
    }

    private static int executeMath(String[] args) {
        if(args[1].equals("+")){
            return Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
        }else if(args[1].equals("-")){
            return Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
        }else if(args[1].equals("*")){
            return Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
        }
        return 0;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

