package observerPattern.demo2;

public interface Publisher {
    // 订阅
    void subscribe(Subscriber subscriber);
    // 取消订阅
    void removeSubscribe(Subscriber subscriber);
    // 发送消息
    void sendMsg(double tempture, double humidity, double pressure);
}
