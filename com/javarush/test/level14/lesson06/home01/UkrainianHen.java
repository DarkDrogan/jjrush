package com.javarush.test.level14.lesson06.home01;

/**
 * Created by drogan on 13.09.15.
 */
public class UkrainianHen extends Hen implements Country
{

    protected UkrainianHen(String name)
    {
        super(name);
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 10;
    }

    public String getDescription()
    {
        String x = (super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
        return x;
    }
}