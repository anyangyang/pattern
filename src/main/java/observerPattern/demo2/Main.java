package observerPattern.demo2;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition(weatherData);
        DataStatistic dataStatistic = new DataStatistic(weatherData);

        weatherData.getRealTimeWeatherData();
    }

}
