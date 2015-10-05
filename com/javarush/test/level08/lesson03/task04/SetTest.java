package com.javarush.test.level08.lesson03.task04;

import java.util.*;

/**
 * Created by drogan on 23.08.15. from Hortsmann
 */
public class SetTest
{
    public static void main(String[] args)
    {
        Set<String> words = new HashSet<String>();
        long totalTime = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20; i++)
            System.out.println(iter.next());
        System.out.println(". . .");
        System.out.println(words.size() + " unique words. " + totalTime + " milliseconds.");
    }
}
