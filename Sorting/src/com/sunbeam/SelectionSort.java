package com.sunbeam;

import java.util.Scanner;

public class SelectionSort {

	public static void selection(int []arr,int size) {
		
		for(int i=0;i<size-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
	}
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the array size:");
		size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the array "+size+" elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before the sort-");
		display(arr);

		System.out.println("\nAfter the sort-");
		selection(arr, size);
		display(arr);
	}

}
