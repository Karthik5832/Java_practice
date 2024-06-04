package src;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the n value: ");
        System.out.println(a +"  "+ b);
        System.out.println("\n\n");
        System.out.print(a +"  "+ b + " ");

        for(int i = 0; i<=7; i++){
            int c = a + b;
            System.out.print(" " + c + " ");
            a = b;
            b = c;

        }
    }
}
