package org.FreemansPattern.OwnLevels.Level02;

import java.util.ArrayList;

/**
 * Created by drogan on 12.09.15.
 */
public class WeatherData implements Subject
{
    public WeatherData()
    {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if(i >= 0)
        {
            observers.remove(i);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void notifyObservers()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurments(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private ArrayList observers;
    private float temperature, humidity, pressure;
}
