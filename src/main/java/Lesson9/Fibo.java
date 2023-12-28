package Lesson9;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Optional;

public class Fibo {
    public static long calculateFibonacci(int n) {
        Optional<Long> result = Stream.iterate(new long[]{0, 1}, pair -> new long[]{pair[1], pair[0] + pair[1]})
                .limit(n)
                .map(pair -> pair[0])
                .reduce((a, b) -> b);
        return result.orElse(0L);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci number index");
        int n = sc.nextInt();
        if (n > 0) {
            long fibonacciN = calculateFibonacci(n);
            System.out.println("Fibo " + n + " = " + fibonacciN);
        }else {
            System.out.println("index must be greater than 0");
        }
    }
}

