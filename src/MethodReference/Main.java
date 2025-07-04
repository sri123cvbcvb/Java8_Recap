package MethodReference;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> emplist = Arrays.asList(

                new Employee("sri", 23, "chennai"),
                new Employee("Ram", 26, "mumbai")
        );

        emplist.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
