package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o preço atual do dólar? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double amount = sc.nextDouble();
        double realPrice = CurrencyConverter.converter(dollarPrice, amount);
        String iofPercentage = String.format("%.2f%%", CurrencyConverter.IOF);
        System.out.printf("Quantia a ser paga em Reais(IOF = %s): R$ %.2f", iofPercentage, realPrice);
    }
}