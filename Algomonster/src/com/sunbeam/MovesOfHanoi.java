package com.sunbeam;

import java.util.Scanner;

public class MovesOfHanoi {

    public static int tower(int n, char src, char aux, char dest) {
        
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return 1;   // one move
        }

        int moves = 0;

        // Move n-1 disks from source to auxiliary
        moves += tower(n - 1, src, dest, aux);

        // Move the largest disk
        System.out.println(src + " -> " + dest);
        moves += 1;

        // Move n-1 disks from auxiliary to destination
        moves += tower(n - 1, aux, src, dest);

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of disks:");
        int n = sc.nextInt();

        int totalMoves = tower(n, 'A', 'B', 'C');

        System.out.println("Total moves = " + totalMoves);

        sc.close();
    }
}
