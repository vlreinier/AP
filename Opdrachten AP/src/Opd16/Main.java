package Opd16;

public class Main {
    public static void main(String[] arg) {
        System.out.println(MoneyUtils.amount("EUR", 3.1431592));
        System.out.println(MoneyUtils.amount("USD", 3.1431592, 1));
        System.out.println("Count runtimes: "+ MoneyUtils.getCount());
    }

}

