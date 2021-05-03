package weather.station;

import java.text.MessageFormat;

public class CurrentWeatherMonitor implements Observer, Monitor {

    private float temperature;
    private float humidity;

    public CurrentWeatherMonitor(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void show() {
        System.out.println("Current weather:");
        System.out.println(MessageFormat.format("Temperature: {0} Humidity: {1}", temperature, humidity));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        show();
    }
}
