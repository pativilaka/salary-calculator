package org.example;

import org.example.entities.Employee;
import org.example.services.PensionService;
import org.example.services.SalaryService;
import org.example.services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salário bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        SalaryService salaryService = new SalaryService();

        double netSalary = salaryService.netSalary(employee);

        System.out.printf("Salário líquido = %.2f%n", netSalary);



    }
}