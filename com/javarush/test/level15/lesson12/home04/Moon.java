package com.javarush.test.level15.lesson12.home04;

/**
 * Created by drogan on 21.10.15.
 */
public class Moon implements Planet
{
    private static Moon instance;

    private Moon(){
        //code Sun
    }

    public static Moon getInstance(){
        if(instance == null)
            instance = new Moon();
        return instance;
    }
}
