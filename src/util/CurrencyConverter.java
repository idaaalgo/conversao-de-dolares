package util;

public class CurrencyConverter {
    public static final double IOF = 6.0;
    public static double converter(double price, double amount) {
        return (price * amount) + (price * amount * (IOF / 100));
    }
}