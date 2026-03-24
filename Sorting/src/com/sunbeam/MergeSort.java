package com.sunbeam;

import java.util.Scanner;

public class MergeSort {

	public static void mergesort(int []arr,int low,int high) {
		
		if(low>=high)
			return;
		int mid=(low+high)/2;
		mergesort(arr,low,mid);
		mergesort(arr, mid+1, high);
		//Merging process
		int size=high-low+1;
		int []temp=new int[size];
		int i=low,j=mid+1,k=0;
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<=mid)
			temp[k++]=arr[i++];
		while(j<=high)
			temp[k++]=arr[j++];
		for(i=0;i<size;i++)
			arr[low+i]=temp[i];
	}
	
	public static void display(int []arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter a array size-");
		size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter array element of size("+size+")-");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Before sorting the array-");
		display(arr);
		mergesort(arr,0,size-1);
		System.out.println("\nAfter sorting the array-");
		display(arr);
	}

}
