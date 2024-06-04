package src;
import java.util.Scanner;
public class PrintEvenSumOfFactorAndOddSumOfFactor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int evenSum = 0;
        int oddSum = 0;

        for( int num = sc.nextInt(); num > 0; num = num / 10) {
            int reminder = num % 10;

            if(reminder %2 == 0) {
                evenSum = evenSum + reminder;
            } else {
                oddSum = oddSum + reminder;
            }
        }
        System.out.println("Even number is " + evenSum);
        System.out.println("odd number is " + oddSum);
    }

}