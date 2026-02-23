package com.sunbeam;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment01_Q2 {

    // i. Linear Search with comparison count
    public static int linearSearch(int[] arr, int key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == key) {
                break;
            }
        }
        return comparisons;
    }

    // ii. Binary Search with comparison count
    public static int binarySearch(int[] arr, int key) {
        int comparisons = 0;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            comparisons++;
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return comparisons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example sorted array (Binary search requires a sorted array)
        int[] data = {10, 23, 35, 48, 50, 71, 82, 94, 100};
        
        System.out.println("Array: " + Arrays.toString(data));
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int linearCount = linearSearch(data, key);
        int binaryCount = binarySearch(data, key);

        System.out.println("Comparisons in Linear Search: " + linearCount);
        System.out.println("Comparisons in Binary Search: " + binaryCount);
        
        sc.close();
    }
}
