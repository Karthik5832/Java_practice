package src;
import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = num;

        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        num = m;
        int sum = 0;
        while(num>0)
        {
            int d = num%10;
            int prod = 1;
            for(int i = 1; i <= count; i++){
                prod*=d;
            }
            sum+=prod;
            num/=10;
        }
        if(sum == m){
            System.out.println("It is a Armstrong number");
        } else{
            System.out.println("It is not an Armstrong number");
        }
    }
}
