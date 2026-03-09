package com.sunbeam;
import java.util.Scanner;

public class PrimeFactors {

	private static void printPrimeFactors(int number, int divisor) {
        // Base case: If the number is 1, all factors have been found.
        if (number <= 1) {
            return;
        }

        // If the current divisor is a factor
        if (number % divisor == 0) {
            System.out.print(divisor + " ");
            // Recurse with the reduced number and the same divisor (a number can have
            // the same prime factor multiple times, e.g., 12 = 2 * 2 * 3)
            printPrimeFactors(number / divisor, divisor);
        } else {
            // If the current divisor is not a factor, try the next one.
            // A number can only be divided by prime numbers
            printPrimeFactors(number, divisor + 1);
        }
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Prime factors of " + num + " are: ");
        printPrimeFactors(num, 2); // Start the factorization with the first prime, 2
        input.close();
    }

    
    
   
}
