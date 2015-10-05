package com.javarush.test.level14.lesson06.home01;

/**
 * Created by drogan on 13.09.15.
 */
public class RussianHen extends Hen implements Country
{

    protected RussianHen(String name)
    {
        super(name);
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 20;
    }

    public String getDescription()
    {
        String x = (super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
        return x;
    }

}
