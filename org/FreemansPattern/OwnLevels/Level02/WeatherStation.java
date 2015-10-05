package org.FreemansPattern.OwnLevels.Level02;


public class WeatherStation
{
	public static void main(String[] args)
	{
		WeatherData weatherData = new WeatherData();

		CurrentConditionalDisplay currentConditionalDisplay = new CurrentConditionalDisplay(weatherData);

		weatherData.setMeasurments(80, 65, 30.4f);
		weatherData.setMeasurments(70, 55, 32.4f);
		weatherData.setMeasurments(60, 50, 34.4f);
	}	
}