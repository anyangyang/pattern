package observerPattern.demo2;

public interface Subscriber {
    void receiveMsg(double tempture, double humidity, double pressure);
}
