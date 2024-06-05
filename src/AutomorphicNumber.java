package src;
import java.util.Scanner;
public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int m = num;
        int sq = num*num;

        boolean flag = true;

        while(num>0) {

            if(num%10 != sq%10) {
                flag=false;
                break;
            }
            num/=10;
            sq/=10;

        }
        if (flag==true) {
            System.out.println(m + " is an automorphic number.");
        }
        else {
            System.out.println(m + " is not an automorphic number.");

        }

    }
}
//another method for this above code
//int i = 1;
//
//        while(num>0) {
//i *= 10;
//num/=10;
//        }
//
//int sq = m*m;
//         if(m==(sq%i)) {
//        System.out.println("Given number is Automorphic");
//        } else{
//                System.out.println("Given number is not Automorphic");
//         }
