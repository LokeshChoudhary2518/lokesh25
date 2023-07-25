package search;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largestNumber = num1;
        if (num2 > largestNumber) {
            largestNumber = num2;
        }
        if (num3 > largestNumber) {
            largestNumber = num3;
        }

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3.0;

        // Calculate and display the sum of the largest number
        int sum = largestNumber;
        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The sum of the largest number is: " + sum);
        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}

