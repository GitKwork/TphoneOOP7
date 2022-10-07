public class Landlinephone extends Phone implements Fax {
    private String DialType;

    public Landlinephone(int year, String model, String dialType) {
        super(year, model);
        DialType = dialType;
    }

    @Override
    public void call() {
    }

    @Override
    public void sendFax() {
    }
}