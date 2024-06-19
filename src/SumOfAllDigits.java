package src;
import java.util.Scanner;

public class SumOfAllDigits {

    public static void main(String[] args) {

        System.out.println("1. Sum of all  2. Prime");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice: ");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int sum = sumOffAllDigits(num);
            System.out.println(sum);
        } else if(choice == 2) {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            displayPrimeNumbers(a, b);
        } else {
            System.out.println("Invalid choice.");
        }
    }


    static void displayPrimeNumbers(int a, int b) {

    }

    static int sumOffAllDigits(int num) {
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
        return sum;

    }
}



