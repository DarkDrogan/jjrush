package org.FreemansPattern.OwnLevels.Level01;

/**
 * Created by drogan on 12.09.15.
 */
public class MallardDuck extends Duck
{
    MallardDuck()
    {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("I'm mallard duck, mthfckr!");
    }
}
