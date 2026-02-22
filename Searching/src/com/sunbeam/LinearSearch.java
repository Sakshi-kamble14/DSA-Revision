package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	public static int linear(int arr[],int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) return i+1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Which key need to find:");
		int key=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter array of size:"+size);
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int index=linear(arr,key);
		if(index!=-1) {
			System.out.println("Given key is found at "+index+" position");
		}
		else {
			System.out.println("Given key is not found");
		}
		

	}

}
