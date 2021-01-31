package observerPattern.demo2;

public class SimpleForecast implements Subscriber, DisplayElement {

    public SimpleForecast(Publisher publisher) {
        if(publisher == null) {
            throw new RuntimeException("publisher is null");
        }
        publisher.subscribe(this);
    }

    public void receiveMsg(double tempture, double humidity, double pressure) {
        display(tempture, humidity, pressure);
    }

    public void display(double tempture, double humidity, double pressure) {
        System.out.println("simple forecast: tempture [ " + tempture + " ] "
                + "humidity [ " + humidity + " ] "
                + "pressure [ " + pressure + " ] ");
    }
}
