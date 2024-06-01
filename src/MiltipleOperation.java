package src;

import java.util.Scanner;

class MiltipleOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Even or Odd\n 2.Greatest of two numbers\n 3.Greatest of three numbers\n4. Smallest of three numbers" +
                "\n5.Finding Leap year\n6.Calculate currency notes \n");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter valid number: ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " is even");
                } else {
                    System.out.println(num + " is odd");
                }

            }
            break;

            case 2: {
                System.out.print("Enter two values: ");

                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                if (num1 > num2) {
                    System.out.println(num1 + " is greater");
                } else {
                    System.out.println(num2 + "is greater");
                }
            }
            break;

            case 3: {
                System.out.print("Enter three numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                if (num1 >= num2 && num1 >= num3) {
                    System.out.println(num1 + " is greater");
                } else if (num2 >= num1 && num2 >= num3) {
                    System.out.println(num2 + " is greater");
                } else {
                    System.out.println(num3 + " is greater");
                }
            }
            break;

            case 4: {
                System.out.print("Enter three numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                if (num1 <= num2 && num1 <= num3) {
                    System.out.println(num1 + " is smallest");
                } else if (num2 <= num1 && num2 <= num3) {
                    System.out.println(num2 + " is smallest");
                } else {
                    System.out.println(num3 + " is smallest");
                }
            }
            break;

            case 5: {
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            }
            break;
            case 6: {
                int count;
                System.out.print("Enter the amount: ");
                int amount = scanner.nextInt();
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
                    System.out.println("100 scanner " + count);
                }
                if (amount >= 50) {
                    count = amount / 50;
                    amount = amount % 50;
                    System.out.println("50 X " + count);
                }

                System.out.println("Remaining amount is " + amount);
            }
            break;

        }
    }

}

