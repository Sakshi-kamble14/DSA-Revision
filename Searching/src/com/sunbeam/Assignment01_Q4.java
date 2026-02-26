package com.sunbeam;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment01_Q4 {

      public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid+1;
            } else if (arr[mid] < key) {
                high=mid-1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] data = {100,90,80,70,60,50,40,30,20,10};
        
        System.out.println("Array: " + Arrays.toString(data));
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        
        int result=binarySearch(data, key);
        if(result!=-1)
            System.out.println("Key found at position-"+result);
        else
            System.out.println("Key not found");
        
        sc.close();
    }
}
