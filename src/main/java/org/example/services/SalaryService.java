package org.example.services;

import org.example.entities.Employee;

public class SalaryService {

    //Forma errada

    private PensionService pensionService;
    private TaxService taxService;

    public SalaryService(TaxService taxService, PensionService pensionService){
        this.taxService = taxService;
        this.pensionService = pensionService;
    }
    public double netSalary(Employee employee){
        return employee.getGrossSalary() - pensionService.discount(employee.getGrossSalary())
                - taxService.tax(employee.getGrossSalary());
    }

}
