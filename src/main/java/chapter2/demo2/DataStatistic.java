package chapter2.demo2;

public class DataStatistic implements Subscriber, DisplayElement{

    public DataStatistic(Publisher publisher) {
        if(publisher == null) {
            throw new RuntimeException("publisher is null");
        }
        publisher.subscribe(this);
    }

    public void receiveMsg(double tempture, double humidity, double pressure) {
        display(tempture, humidity, pressure);
    }

    public void display(double tempture, double humidity, double pressure) {
        System.out.println("statistic: tempture [ " + tempture + " ] "
                + "humidity [ " + humidity + " ] "
                + "pressure [ " + pressure + " ] ");
    }

}
