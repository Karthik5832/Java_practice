package src;

import java.util.Scanner;

public class FibonacciSeriesWithRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);


        for (; ; ) {
            int c = a + b;

            if (c >= range) break;
            System.out.print(" " + c +" ");
            a = b;
            b = c;
        }

    }
}



