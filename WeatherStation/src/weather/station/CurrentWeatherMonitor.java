package weather.station;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.MessageFormat;

public class CurrentWeatherMonitor implements PropertyChangeListener, Monitor {

    private float temperature;
    private float humidity;

    public CurrentWeatherMonitor() {
    }

    @Override
    public void show() {
        System.out.println("Current weather:");
        System.out.println(MessageFormat.format("Temperature: {0} Humidity: {1}", temperature, humidity));
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        WeatherData data = (WeatherData) evt.getNewValue();
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        show();
    }
}
