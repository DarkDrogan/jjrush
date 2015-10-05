package org.FreemansPattern.OwnLevels.Level01;

/**
 * Created by drogan on 12.09.15.
 */
public class MuteQuack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Silence, I kill you!");
    }
}
