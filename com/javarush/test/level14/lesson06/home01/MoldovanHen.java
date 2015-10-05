package com.javarush.test.level14.lesson06.home01;

/**
 * Created by drogan on 13.09.15.
 */
public class MoldovanHen extends Hen implements Country
{

    protected MoldovanHen(String name)
    {
        super(name);
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 15;
    }

    public String getDescription()
    {
        String x = (super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
        return x;
    }
}