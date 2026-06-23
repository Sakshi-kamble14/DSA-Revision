package com.sunbeam;

import java.util.Scanner;

public class TowerofHanoi {

	public static void tower(int n,char src,char aux,char dest) {
		
		if(n==1) {
			System.out.println(src+"->"+dest);
			return;
		}
		tower(n-1,src,dest,aux);
		tower(1,src,aux,dest);
		tower(n-1,aux,src,dest);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of disks-");
		n=sc.nextInt();
		tower(n,'A','B','C');
	}

}
