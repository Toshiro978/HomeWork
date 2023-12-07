package Lesson3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount for convert USD to UAH:");
        double amount = sc.nextDouble();

        CurrencyConverter converterToUah = new CurrencyConverter(0.01,36.55);
        String result = String.format("%.2f",converterToUah.calculateTotalAmount(amount));
        System.out.println("Amount in UAH after conversion: " + result);
        System.out.println("Goodbye, have a good day!!!");



    }
}
