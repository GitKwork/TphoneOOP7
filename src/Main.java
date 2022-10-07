public class Main {
    public static void main(String[] args) {

        CellPhone siemensS10 = new CellPhone(1999, "S10", 10, "ProprietarySoftware");
        Landlinephon euroset = new Landlinephone(2000, "2010", "KeysTouches");
        Smartphone iPhone1 = new Smartphone(2007, "iPhone1", 48, "iPhone OS 1.0", "480x320", 3.5, 128);

        siemensS10.call();
        siemensS10.sendSMS();
        euroset.sendFax();
        euroset.call();
        iPhone1.call();
        iPhone1.internet();
        iPhone1.sendSMS();
        iPhone1.sendEmail();
    }
}