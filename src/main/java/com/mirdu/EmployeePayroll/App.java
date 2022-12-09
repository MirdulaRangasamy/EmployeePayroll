package com.mirdu.EmployeePayroll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mirdu.EmployeePayroll.payroll.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp = context.getBean(Employee.class);
        emp.setEmpid(101);
        emp.setEmpname("Ashish");
        emp.setEmpdept("Development");
        emp.calculateSalary();
        System.out.println(emp.hashCode());
        emp = context.getBean(Employee.class);
        emp.setEmpid(101);
        emp.setEmpname("Akshay");
        emp.setEmpdept("Development");
        emp.calculateSalary();
        System.out.println(emp.hashCode());
    }
}
