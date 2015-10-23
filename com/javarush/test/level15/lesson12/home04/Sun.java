package com.javarush.test.level15.lesson12.home04;

/**
 * Created by drogan on 21.10.15.
 */
public class Sun implements Planet
{
    private static Sun instance;

    private Sun(){
        //code Sun
    }

    public static Sun getInstance(){
        if(instance == null)
            instance = new Sun();
        return instance;
    }
}
