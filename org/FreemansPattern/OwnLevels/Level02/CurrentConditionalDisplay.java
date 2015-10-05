package org.FreemansPattern.OwnLevels.Level02;

/**
 * Created by drogan on 13.09.15.
 */
public class CurrentConditionalDisplay implements Observer, DisplayElement
{

    public CurrentConditionalDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidiry, float pressure)
    {
        this.temperature = temperature;
        this.humidiry = humidiry;
        this.pressure = pressure;
        display();
    }

    public void display()
    {
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidiry + "% humidiry");
    }

    private float temperature;
    private float humidiry;
    private float pressure;
    private Subject weatherData;
}
