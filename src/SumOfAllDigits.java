package src;
import java.util.Scanner;

public class SumOfAllDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int reminder = num % 10;
            sum = sum + reminder;
            num = num / 10;

            if(num == 0 && sum > 9) {
                System.out.println(sum);
                num = sum;
                sum = 0;
            }
        }

       System.out.println(sum);
    }
}



