
public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
		weatherData.SetMeasurements(80,65, 30.4f);
	}
}
