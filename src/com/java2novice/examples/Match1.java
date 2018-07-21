package com.java2novice.examples;

import java.util.ArrayList;
import java.util.List;

//http://www.java2novice.com/java-8/streams/reduce-method-example/

public class Match1 {

	public static void main(String a[]) {
		 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Admin", 12500));
 
        boolean result = empList.stream().anyMatch(emp->emp.getAccount().matches("Admin"));
        System.out.println(result);
 
        result = empList.stream().allMatch(emp->emp.getAccount().matches("Admin"));
        System.out.println(result);
 
        result = empList.stream().noneMatch(emp->emp.getAccount().matches("Admin"));
        System.out.println(result);
    }
}
