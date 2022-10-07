public class CellPhone extends WirelessPhone implements Textable {
    private String operationSystem;

    public CellPhone(int year, String model, int hour, String operationSystem) {
        super(year, model, hour);
        this.operationSystem = operationSystem;
    }

    @Override
    public void call() {
    }

    @Override
    public void sendSMS() {
        super.sendSMS();
    }
}