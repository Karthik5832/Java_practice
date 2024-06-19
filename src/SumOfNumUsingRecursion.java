package src;
import java.util.Scanner;
public class SumOfNumUsingRecursion {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int res = sum(num);
        System.out.println("res = " + res);
    }
    static int sum(int num){
        if(num == 1) return 1;
        return num+ sum(num-1);
    }
}
