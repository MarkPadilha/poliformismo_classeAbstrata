package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter  number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
				
		for(int x=1; x<=n; x++) {
			System.out.println("enter payer #" + x +" data: ");
			System.out.print("Individual or company(i/c): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				list.add(new Individual(name, anualIncome, sc.nextDouble()));
			}else if(ch == 'c') {
				System.out.print("Number of employee: ");
				list.add(new Company(name, anualIncome, sc.nextInt()));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0;
		for(TaxPayer c : list) {
			System.out.println(c.getName() + ": $" + String.format("%.2f",c.tax()));
			sum += c.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		sc.close();
	}

}
