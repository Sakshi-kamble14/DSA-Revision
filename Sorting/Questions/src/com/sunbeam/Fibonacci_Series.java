package com.sunbeam;

import java.util.Scanner;

public class Fibonacci_Series {

	public static int fibo(int n) {
		if(n<=1) return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the terms-");
		int terms=sc.nextInt();
		System.out.print("Fibonacci Series ");
		for(int i=0;i<terms;i++)
		System.out.print(fibo(i)+" ");
		
	}

}
