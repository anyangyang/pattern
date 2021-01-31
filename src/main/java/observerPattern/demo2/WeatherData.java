package observerPattern.demo2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher{

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        if(!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    public void removeSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendMsg(double tempture, double humidity, double pressure) {
        for(Subscriber subscriber : subscribers) {
            subscriber.receiveMsg(tempture, humidity, pressure);
        }
    }

    // 实时获取信息，并且刷新展示窗口
    public void getRealTimeWeatherData() {
        double tempture = getRealTimeTempture();
        double humidity = getRealTimeHumidity();
        double pressure = getRealTimePressure();

        // 气象数据变化，刷新展示窗口
        sendMsg(tempture, humidity, pressure);
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


}
