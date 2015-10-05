package org.FreemansPattern.OwnLevels.Level01;

/**
 * Created by drogan on 12.09.15.
 */
public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck()
    {
    }

    public abstract void display();

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void swim()
    {
        System.out.println("All duck can swim... Quack, quack, motherfucker!");
    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }
}
