package com.sunbeam;

import java.util.Scanner;

public class Power {

	public static int power(int base,int expo) {
		if(expo==0) return 1;
		return base*power(base,expo-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base,expo;
		System.out.println("Enter the base-");
		base=sc.nextInt();
		System.out.println("Enter the expo-");
		expo=sc.nextInt();
		System.out.println("Power of given input "+power(base, expo));
		sc.close();
	}

}
