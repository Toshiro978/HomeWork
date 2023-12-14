package Lesson5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator for the first fraction");
        int num1 = sc.nextInt();
        System.out.println("Enter the denominator for the first fraction");
        int dum1 = sc.nextInt();
        System.out.println("Enter the numerator for the second fraction");
        int num2 = sc.nextInt();
        System.out.println("Enter the denominator for the second fraction");
        int dum2 = sc.nextInt();

        Fraction fraction1 = new Fraction(num1,dum1);
        Object fraction2 = new Fraction(num2,dum2);

        System.out.println(fraction1.equals(fraction2));

    }
}
