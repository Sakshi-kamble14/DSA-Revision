package com.sunbeam;

import java.util.Scanner;
//Write a linear search to find last occurance of given key
//Q1
public class Assignment01_Q1 {

	public static int lastOccurance(int arr[],int key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)  count++;
		}
		
		return count;
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
		int index=lastOccurance(arr,key);
		if(index!=-1) {
			System.out.println("Last occurance of given key at "+index+" position");
		}
		else {
			System.out.println("Given key is not found");
		}
		

	}

}
