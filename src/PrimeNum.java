package src;

import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;

        for(int i = 2; i <= n/2; i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Given number is prime number");

        }else{
            System.out.println("Given number is not a prime number");
        }
    }
}
