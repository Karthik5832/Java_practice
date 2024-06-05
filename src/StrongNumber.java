package src;
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int m = num;
        int sum = 0;

        while( num > 0) {
            int d = num%10;
            int prod = 1;
            for(int i = 1;i <= d; i++) {
                prod*= i;
            }
            sum+= prod;
            num/= 10;
        }
        if( m == sum) {
            System.out.println("Strong number");
        } else{
            System.out.println("Its not strong number");
        }

    }
}
