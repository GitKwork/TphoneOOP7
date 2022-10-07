public class WirelessPhone extends Phone implements Textable {
    private int hour;

    public WirelessPhone(int year, String model, int hour) {
        super(year, model);
        this.hour = hour;
    }

    @Override
    public void call() {
    }

    @Override
    public void sendSMS() {
    }
}