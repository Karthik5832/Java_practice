package src;

import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args){

        System.out.print("enter the value of a,b and c: ");
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
