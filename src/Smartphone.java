public class Smartphone extends CellPhone implements Internet, EMail {
    String screenResolution;
    int screenSize;
    int memory;

    public Smartphone(int year, String model, int hour, String operationSystem, String screenResolution, int screenSize, int memory) {
        super(year, model, hour, operationSystem);
        this.screenResolution = screenResolution;
        this.screenSize = screenSize;
        this.memory = memory;
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void sendEmail() {
    }

    @Override
    public void internet() {
    }

    @Override
    public void sendSMS() {
        super.sendSMS();
    }
}