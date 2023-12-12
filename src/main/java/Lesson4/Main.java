package Lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 7, 31, 4, -2, 4, -1, 5, 18, 99, 32};
        System.out.println("Write 1 in terminal to output Triangle");
        System.out.println("Write 2 in terminal to output Rhomb");
        System.out.println("Write 3 in terminal to output sorted massive");
        Scanner sc = new Scanner(System.in);
        int KeyInterface = sc.nextInt();


        Figure Illustration = new Figure();
        switch (KeyInterface) {
            case (1):
                Illustration.OutPutTriangle();
                break;
            case (2):
                Illustration.OutPutRhomb();
                break;
            case (3):
                for (int num : arr)
                    System.out.print(num + " ");

                Sorting.bubbleSort(arr);
                System.out.println();

                for (int num : arr
                ) {
                    System.out.print(num + " ");

                }
                break;
        }
    }
}