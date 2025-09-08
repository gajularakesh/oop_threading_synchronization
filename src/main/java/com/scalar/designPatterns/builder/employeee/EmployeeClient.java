package com.scalar.designPatterns.builder.employeee;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee e1 = Employee.employeeBuilder()
                .name("Rakesh")
                .age(26)
                .id(1234)
                .salary(1234456.5)
                .build();

        System.out.println(e1.toString());
    }


}
