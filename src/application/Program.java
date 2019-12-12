package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employees empregado = new Employees();
		
		System.out.print("Enter the employee id that will salary increase: ");
		empregado.setId(sc.nextInt());
		System.out.println(" ");
		System.out.print("Enter the name: ");
		empregado.setName(sc.nextLine());
		System.out.print("Enter with salary: ");
		empregado.setSalary(sc.nextDouble());
		
		System.out.println("Enter the porcentage: ");
		empregado.increaseSalary(sc.nextDouble());
		
		System.out.println("Salario: " + empregado.getSalary());
		
		sc.close();
	}

}
