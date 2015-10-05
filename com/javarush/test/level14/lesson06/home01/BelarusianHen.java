package com.javarush.test.level14.lesson06.home01;

/**
 * Created by drogan on 13.09.15.
 */
public class BelarusianHen extends Hen implements Country
{

    protected BelarusianHen(String name)
    {
        super(name);
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 5;
    }

    public String getDescription()
    {
        String x = (super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
        return x;
    }
}
