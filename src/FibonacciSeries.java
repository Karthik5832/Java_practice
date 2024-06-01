package src;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a +"  "+ b);

        for(int i = 3; i<=10; i++){
            int c = a + b;
            System.out.print(" " + c + " ");
            a = b;
            b = c;

        }
    }
}
