package src;
import java.util.Scanner;
public class LCMforGivenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1 and num2: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int n = num1>num2? num1:num2;
        int i = n;

        while(true){
            if( n % num1 == 0 && n % num2 == 0)break;
            n += i;
        }
        System.out.println(n);

    }

}
