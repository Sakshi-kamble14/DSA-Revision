package com.sunbeam;

import java.util.Scanner;

public class Character_search {

	public static int name(String arr,char key) {
		for(int i=0;i<arr.length();i++) {
			if(key==arr.charAt(i)) {
				return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input-");
		String input=sc.next();
		int result=name(input, 's');
		if(result!=0) System.out.println("Char found!");
		else System.out.println("Char not found");
		sc.close();
	}

}
