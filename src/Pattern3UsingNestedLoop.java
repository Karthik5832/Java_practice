package src;
import java.util.Scanner;
public class Pattern3UsingNestedLoop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i =1; i <= num; i++){

             for(int j =1; j <=num*2-1; j++){

                 if(i+j > num && j <= num+i-1){
                     System.out.print("X");
                 } else{
                     System.out.print("_");
                 }
             }
             System.out.println();
         }
    }
}
