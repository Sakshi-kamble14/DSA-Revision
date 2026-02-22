package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {

	public static int binary(int arr[],int key) {
		
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) return mid+1;
			else if(arr[mid]>key) high=mid-1;
			else low=mid+1;
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
		int index=binary(arr,key);
		if(index!=-1) {
			System.out.println("Given key is found at "+index+" position");
		}
		else {
			System.out.println("Given key is not found");
		}
		

	}

}
