package com.javarush.test.level14.lesson08.home05;

/**
 * Created by drogan on 15.09.15.
 */
public class Keyboard implements ComItem
{
    @Override
    public String getName()
    {
        return getClass().getSimpleName();
    }
}
