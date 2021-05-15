package weather.station;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        data.setMeasurementValues(20, 78, 4);

        CurrentWeatherMonitor monitor = new CurrentWeatherMonitor();
        data.addPropertyChangeListener(monitor);
        monitor.show();

        data.setMeasurementValues(30, 60, 5);
        data.setMeasurementValues(18, 20, 1);
    }
}
