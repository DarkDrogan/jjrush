package com.javarush.test.level15.lesson12.home05;

/**
 * Created by drogan on 19.10.15.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
    }

    public SubSolution(String s, String xc)
    {
        super(s, xc);
    }

    public SubSolution(String s, int i, int dc)
    {
        super(s, i, dc);
    }

    protected SubSolution(String s)
    {
        super(s);
    }

    protected SubSolution(String x, long id, int i)
    {
        super(x, id, i);
    }

    protected SubSolution(long id, String x, int i)
    {
        super(id, x, i);
    }

    SubSolution(int id)
    {
        super(id);
    }

    SubSolution(long id, int idc)
    {
        super(id, idc);
    }

    SubSolution(long id, int idc, String iDontCare)
    {
        super(id, idc, iDontCare);
    }

    private SubSolution(boolean logic){

    }

    private SubSolution(boolean logic, String dot){

    }

    private SubSolution(boolean logic, String dot, String net){

    }
}
