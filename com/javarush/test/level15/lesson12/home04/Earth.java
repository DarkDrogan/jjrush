package com.javarush.test.level15.lesson12.home04;

/**
 * Created by drogan on 21.10.15.
 */
public class Earth implements Planet
{
    private static Earth instance;

    private Earth(){
        //code Sun
    }

    public static Earth getInstance(){
        if(instance == null)
            instance = new Earth();
        return instance;
    }
}
