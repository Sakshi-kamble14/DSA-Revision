package com.sunbeam;

import java.util.Scanner;

public class UpdateHanoi {

    public static void tower(int n, char src, char aux, char dest) {

        if (n == 1) {
            System.out.println(src + "->" + dest);
            return;
        }

        tower(n - 1, src, dest, aux);

        // direct move instead of tower(1,...)
        System.out.println(src + "->" + dest);

        tower(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of disks-");
        int n = sc.nextInt();

        tower(n, 'A', 'B', 'C');

        sc.close();
    }
}