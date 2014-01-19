package com.test.sinan;

public class EmployeeTest {
  public static void main(String[] args) {
      
    Employee e = new Employee("Steve", "Balmer", 2, "Microsoft");
    System.out.println("Employee's full name: " + e.getFullName());
    System.out.println("Employee's ID: " + e.getEmployeeId());
    System.out.println("Employee's company: " + e.getCompanyName());

  }
  
}
