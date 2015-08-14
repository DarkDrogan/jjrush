package com.javarush.test.level00.lesson03.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by drogan on 09.08.15.
 */
public class TimeCalc
{
    int sec, min, hours;

    public static void main(String [] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int v, sum = 0;

        System.out.println("Выберети тип калькуляции:\n1)Часы\n2)Минуты\n3)Секунды");
        v = Integer.parseInt(reader.readLine());

        do
        {

            if(v == 1)
            {
                int h = Integer.parseInt(reader.readLine());
                int m = Integer.parseInt(reader.readLine());
                int s = Integer.parseInt(reader.readLine());

                sum = sum + calcHours(h, m, s);

                System.out.println("Продолжить? Д/н");
                String n = reader.readLine();

                if(n.equals("н"))
                {
                    toString(sum);
                    break;
                }
            }

            if(v == 2)
            {
                int m = Integer.parseInt(reader.readLine());
                int s = Integer.parseInt(reader.readLine());

                sum = sum + calcMinutes(m, s);

                System.out.println("Продолжить? Д/н");
                String n = reader.readLine();

                if(n.equals("н"))
                {
                    toString(sum);
                    break;
                }
            }

            if(v == 3)
            {
                int s = Integer.parseInt(reader.readLine());

                sum = sum + s;

                System.out.println("Продолжить? Д/н");
                String n = reader.readLine();

                if(n.equals("н"))
                {
                    toString(sum);
                    break;
                }
            }
        }
        while(true);

        System.out.println(toString(sum));

    }

    private static int calcHours(int a, int b, int c)
    {
        int d = a * 3600 + b * 60 + c;
        return d;
    }

    private static int calcMinutes(int a, int b)
    {
        int d = a * 60 + b;
        return d;
    }

    //return time in format h:m:s
    private static String toString(int a)
    {
        int b, c;

        c = a/3600;
        b = (a - c * 3600)/60;
        a = a%3600%60;

        return c + ":" + b + ":" + a;
    }

}
