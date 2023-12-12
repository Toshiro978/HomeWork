package Lesson4;

public class Figure {

    public void OutPutTriangle() {
        int count = 0;
        for (int i = 0; i <= 4; ++i) {
            for (int j = 4; i <= j; --j) {
                System.out.print("  ");
                count = i * 2;
            }
            while (0 <= count) {
                System.out.print(" ");
                System.out.print("*");
                count--;
            }
            System.out.println();
        }
    }

    public void OutPutRhomb() {
        int count = 0;
        for (int i = 0; i <= 4; ++i) {
            for (int j = 4; i <= j; --j) {
                System.out.print("  ");
                count = i * 2;
            }
            while (0 <= count) {
                System.out.print(" ");
                System.out.print("*");
                count--;
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; --i) {
            for (int j = 4; i <= j; --j) {
                System.out.print("  ");
                count = i * 2;
            }
            while (0 <= count) {
                System.out.print(" ");
                System.out.print("*");
                count--;
            }
            System.out.println();
        }
    }
}
