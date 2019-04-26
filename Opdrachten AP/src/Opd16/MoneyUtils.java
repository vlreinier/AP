package Opd16;

public class MoneyUtils {
    private static int count;

    public static String amount(String currency, double amount){
        count+=1;
        return getSymbol(currency) +  Math.round(amount * 100.0) / 100.0;
    }

    public static String amount(String currency, double amount, int precision){
        count+=1;
        return getSymbol(currency) + Math.round(amount *  Math.pow(10, precision)) /  Math.pow(10, precision);
    }

    public static int getCount() {
        return count;
    }

    public static String getSymbol(String currency){
        String symbol = "";
        if (currency.equals("EUR"))
            symbol = "€ ";
        else if (currency.equals("USD"))
            symbol = "$ ";
        return symbol;
    }
}
