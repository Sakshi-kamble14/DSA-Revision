package com.sunbeam;

import java.util.Scanner;

public class BubbleSort {

	public static void bubblesort(int []arr,int left,int right) {
		int pass=0,comps=0;
		for(int i=1;i<arr.length;i++) {
			pass++;
			for(int j=0;j<arr.length-1;j++) {
				comps++;
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("Passes-"+pass);
		System.out.println("Comparison-"+comps);
	}
	public static void improvedbubblesort(int []arr,int left,int right) {
		int pass=0,comps=0;
		for(int i=1;i<arr.length;i++) {
			pass++;
			for(int j=0;j<arr.length-i;j++) {
				comps++;
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("Passes-"+pass);
		System.out.println("Comparison-"+comps);
	}
	
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of array-");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter array-");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Before sorting: ");
		display(arr); 
		System.out.println(); 
		
		bubblesort(arr, 0, size - 1);
		
		System.out.print("After sorting: ");
		display(arr);
		
		System.out.println();
		
		System.out.print("Before sorting: ");
		display(arr); 
		System.out.println(); 
		
		improvedbubblesort(arr, 0, size-1);

		System.out.print("After sorting: ");
		display(arr);
		
	}

}
