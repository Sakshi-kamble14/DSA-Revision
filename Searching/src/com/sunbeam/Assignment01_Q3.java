package com.sunbeam;

import java.util.Scanner;

public class Assignment01_Q3 {

    public static void empsearch(Employee[] emp, int empid) {
        boolean found = false;

        for (Employee e : emp) {
            if (e.getId() == empid) {
                System.out.println("Employee Found:");
                e.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + empid + " not found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        
        System.out.print("\nEnter Employee ID to search: ");
        int searchId = sc.nextInt();
        empsearch(employees, searchId);

        sc.close();
    }
}