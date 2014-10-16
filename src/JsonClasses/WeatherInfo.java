package JsonClasses;
public class WeatherInfo {
	
	private String weatherLocation;
	private String weather;
	private String temperature;
	private String overallID = "weather";
	
	public String getWeatherLocation() {
		return weatherLocation;
	}
	public void setWeatherLocation(String weatherLocation) {
		this.weatherLocation = weatherLocation;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	
}
