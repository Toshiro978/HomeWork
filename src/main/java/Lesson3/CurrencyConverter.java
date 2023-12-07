package Lesson3;

public class CurrencyConverter {
    private double commission ;
    private double exchangeRate;

    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }
    private double convertUsdToUah(double amount) {
    double result;
    result = amount * exchangeRate;

    return result;
    }

    private double calculateCommission(double amount) {
    double result;
    result = this.convertUsdToUah(amount) * commission ;

    return result;
    }


    public double calculateTotalAmount(double amount){
    double result;
    result = this.convertUsdToUah(amount) - this.calculateCommission(amount);

    return result;
    }


}


