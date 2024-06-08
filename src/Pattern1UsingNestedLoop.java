package src;

import java.util.Scanner;

public class Pattern1UsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of the pattern: ");

        int size = sc.nextInt();// size of the pattern


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }
    }
}
//    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        for (int i = 0; i < size; i++) {
//
//            for (int j = 0; j < size; j++) {
//
//                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
//                    System.out.print("X");
//                } else
//                    System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }
//}
//public class method2 {
//    public static void main(String[] args){
//
//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for(int i = 1; i <= num; i++) {
//
//            for(int j = 1; j <= num; j++) {
//
//                if(i == 1  || j == 1 || i == num || j == num ) {
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//
//    }
//
//}

