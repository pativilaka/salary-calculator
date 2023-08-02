package org.example.services;

import org.example.entities.Employee;

public class SalaryService {

    //Forma errada

    PensionService pen = new PensionService();
    TaxService tax = new TaxService();
    public double netSalary(Employee employee){
        return employee.getGrossSalary() - pen.discount(employee.getGrossSalary())
                - tax.tax(employee.getGrossSalary());
    }

}
