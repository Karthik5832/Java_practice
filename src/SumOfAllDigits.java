package src;
import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int i = (n % 10);
            sum = sum + i;
            n = n / 10;

            if(n==0 && sum>9) {
                System.out.println(sum);
                n = sum;
                sum = 0;
            }
        }

        System.out.println(sum);
    }
}



