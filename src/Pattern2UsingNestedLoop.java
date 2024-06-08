package src;
import java.util.Scanner;
public class Pattern2UsingNestedLoop{
    public static void main(String[] args){
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {

                if(i + j == n+1 || i == j) {
                    System.out.print(" X ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}

