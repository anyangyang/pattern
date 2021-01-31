package observerPattern.demo;

public class WeatherData {

    // 实时获取信息，并且刷新展示窗口
    public void getRealTimeWeatherData() {
        double tempture = getRealTimeTempture();
        double humidity = getRealTimeHumidity();
        double pressure = getRealTimePressure();

        // 气象数据变化，刷新展示窗口
        displayCurrentCondition(tempture, humidity, pressure);
        displayStatistic(tempture, humidity, pressure);
        displaySimpleForecast(tempture, humidity, pressure);
    }

    // 从气象数据中心获取实时的温度信息
    public double getRealTimeTempture() {
        return Math.random() * 50.0 + 1;
    }

    // 从气象数据中心获取实时的湿度信息
    public double getRealTimeHumidity() {
        return Math.random() * 20.0 + 1;
    }

    // 从气象数据中心获取实时的气压信息
    public double getRealTimePressure() {
        return Math.random() * 30.0 + 1;
    }

    // 展示当前条件
    public void displayCurrentCondition(double tempture, double humidity, double pressure) {
        System.out.println("current condition: tempture [ " + tempture + " ]"
                + "humidity [ " + humidity + " ]"
                + "pressure [ " + pressure + " ]");
    }

    // 展示历史统计
    public void displayStatistic(double tempture, double humidity, double pressure) {
        System.out.println("statistic: tempture [ " + tempture + " ]"
                + "humidity [ " + humidity + " ]"
                + "pressure [ " + pressure + " ]");
    }

    // 展示简单预测
    public void displaySimpleForecast(double tempture, double humidity, double pressure) {
        System.out.println("simple forecast: tempture [ " + tempture + " ]"
                + "humidity [ " + humidity + " ]"
                + "pressure [ " + pressure + " ]");
    }

}
