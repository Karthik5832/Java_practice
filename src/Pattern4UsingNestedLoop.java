package src;
import java.util.Scanner;

public class Pattern4UsingNestedLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {

                if (j == 1 || i == j || i + j == num -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}