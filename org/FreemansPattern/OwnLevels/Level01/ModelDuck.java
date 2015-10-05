package org.FreemansPattern.OwnLevels.Level01;

/**
 * Created by drogan on 12.09.15.
 */
public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("ModelDuckdckdckdck");
    }
}
