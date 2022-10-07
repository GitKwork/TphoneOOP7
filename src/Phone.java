public abstract class Phone implements Callable {
    private int year;
    private String model;

    public Phone(int year, String model) {
        this.year = year;
        this.model = model;
    }
}