package src;
import java.util.Scanner;
public class Pattern4UsingNestedLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++) {
                if(j == 1 ){
                    System.out.println("X");
                    for(int k = 1;k <= num;k++){

                    }
                }
            }
        }

    }
}
