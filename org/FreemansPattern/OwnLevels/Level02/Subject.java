package org.FreemansPattern.OwnLevels.Level02;

/**
 * Created by drogan on 12.09.15.
 */
public interface Subject
{
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
