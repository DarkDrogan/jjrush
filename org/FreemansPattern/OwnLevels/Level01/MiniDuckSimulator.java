package org.FreemansPattern.OwnLevels.Level01;

/**
 * Created by drogan on 12.09.15.
 */
public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
