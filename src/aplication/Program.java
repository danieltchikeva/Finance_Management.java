package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// This is a program about Employee Salary of business

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		
		System.out.println("\n=== THIS'S A PROGRAM ABOUT EMPLOYEE SALARY OF BUSINESS ===\n");
		System.out.print("Employe's Name: ");
		emp.name = sc.nextLine();

		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated date: " + emp);

		sc.close();
		
		System.out.println("\nA JAVA'S COURSE PROJECT");
		System.out.println("By: Daniel Tchikeva, september 2023");

	}

}
