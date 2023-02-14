package main.java.io;

import java.util.ArrayList;
import java.util.List;

public class StreamExample03 {

    public static class Employee {
        public String salary;
        public Employee(String salary){
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1000"));
        employees.add(new Employee("2000"));
        employees.add(new Employee("3000"));
        employees.add(new Employee("4000"));

        Integer sum = employees.stream()
                .map(emp -> emp.salary)
                .map(Integer::parseInt)
                .reduce(0, (tmpSum, value) -> tmpSum + value);
        System.out.println(sum);
    }
}
