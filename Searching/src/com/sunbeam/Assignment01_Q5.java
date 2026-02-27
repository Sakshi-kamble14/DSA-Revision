package com.sunbeam;

import java.util.Scanner;

public class Assignment01_Q5 {
    public static int nthoccurance(int[] arr, int key, int occ) {
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) {
            count++;
            if (count == occ) {
                return i; // index of nth occurrence
            }
        }
    }
    return -1; // nth occurrence not found
}
    public static void main(String[] args) {
        System.out.println("Enter the array size-");
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int key,occ;
        System.out.println("Enter the key-");
        key=sc.nextInt();
        System.out.println("Enter the nth occurance-");
        occ=sc.nextInt();
        int result=nthoccurance(arr,key,occ);
        if(result!=-1){
            System.out.println("Key found at index "+result);
        }
        else System.out.println("Key not found");
    }
    
}
