package com.sunbeam;

import java.util.Scanner;

public class Lcm {

   
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first and second number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        
        int lcm = (num1 * num2) / gcd(num1, num2);
        int gcd=gcd(num1,num2);
        
        System.out.println("LCM for given numbers is: " + lcm);
        System.out.println("GCD for given numbers is: "+ gcd);
        sc.close();
    }
}
