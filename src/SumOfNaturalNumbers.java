package src;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String s = " ";// Initialize s to an empty string
        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum = sum + i;
            s = s + i;
            if(i < num) {
                s = s + "+";
            }
        }
        s = s + "=" +sum;
        System.out.print(s);

    }
}
