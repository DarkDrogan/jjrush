package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        //add your code here
        ArrayList<String> objParam = new ArrayList<String>();
        ArrayList<String> objList = new ArrayList<String>();

        //take String with url from console
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        String readerURL = reader.readLine();

        //if url have parameters
        if (readerURL.contains("?")){

            //take parametrs
            int parSttInd = readerURL.indexOf("?");
            readerURL = readerURL.substring(parSttInd + 1);

            //delete all symb ?
            readerURL = deleteSymbolAsk(readerURL);
            String [] params = readerURL.split("\\&");
            for(String e : params){
                if(e.length()>4 && e.substring(0, 4).equals("obj=")){
                    if(!e.isEmpty() || !e.equals(""))
                    {
                        objParam.add(e.substring(4));
                    }
                }
                if(!e.isEmpty() || !e.equals("")){
                    if(e.contains("=")){
                        int x = e.indexOf("=");
                        objList.add(e.substring(0, x));
                    } else {
                        objList.add(e);
                    }
                }
            }
            //print name params
            for(int i = 0; i < objList.size(); i++){
                System.out.print(objList.get(i));
                if(i+1 != objList.size()){
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
            for(String e : objParam){
                try
                {
                    alert(Double.parseDouble(e));
                }
                catch (NumberFormatException x)
                {
                    alert(e);
                }
            }
        }
    }

    public static String deleteSymbolAsk(String string){
        String x = string;
        String[] xx = x.split("\\?");
        x = "";
        for(String e : xx){
            x += e;
        }
        return x;
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
