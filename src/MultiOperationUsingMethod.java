package src;

import java.util.Scanner;

class MultiOperationUsingMethod {
    public static void main(String[] args) {
        System.out.println("1. Even or Odd\n2.Greatest of two numbers\n3.Greatest of three numbers\n4.Smallest of three numbers" +
                "\n5.Finding Leap year\n6.Calculate currency notes \n");
        System.out.println("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1: {
                System.out.print("Enter valid number: ");
                int num = scanner.nextInt();
                oddEven(num);
            }
            break;
            case 2: {
                System.out.print("Enter two values: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                greatest(num1, num2);
            }
            break;
            case 3: {
                System.out.print("Enter three numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                greatestOFThree(num1, num2, num3);
            }
            break;
            case 4: {
                System.out.print("Enter three numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                smallestOfThree(num1, num2, num3);
            }
            break;
            case 5: {
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                leapYear(year);
            }
            break;
            case 6: {
                System.out.print("Enter the amount: ");
                int amount = scanner.nextInt();
                checkCurrency(amount);
            }
            break;
            default:
                System.out.println("Invalid choice");

        }

    }

    static void oddEven(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

    }

    static void greatest(int num1, int num2){
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + "is greater");
        }
    }

    static void greatestOFThree(int num1, int num2, int num3){
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }
    }
    static void smallestOfThree(int num1, int num2, int num3){
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " is smallest");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is smallest");
        } else {
            System.out.println(num3 + " is smallest");
        }
    }
    static void leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    static void checkCurrency(int amount){
            int count;
            if (amount >= 2000) {
                count = amount / 2000;
                amount = amount % 2000;
                System.out.println("2000 X " + count);
            }
            if (amount >= 500) {
                count = amount / 500;
                amount = amount % 500;
                System.out.println("500 X " + count);
            }
            if (amount >= 200) {
                count = amount / 200;
                amount = amount % 200;
                System.out.println("200 X " + count);
            }

            if (amount >= 100) {
                count = amount / 100;
                amount = amount % 100;
                System.out.println("100 X " + count);
            }
            if (amount >= 50) {
                count = amount / 50;
                amount = amount % 50;
                System.out.println("50 X " + count);
            }

            System.out.println("Remaining amount is " + amount);
    }
}


