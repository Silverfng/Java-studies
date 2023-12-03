package currencyprogram;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double currencyConversion(double dol, double dolarCurrency) {
        double finalValue = (dol * IOF);
        return (finalValue + dol) * dolarCurrency;
    }

}
