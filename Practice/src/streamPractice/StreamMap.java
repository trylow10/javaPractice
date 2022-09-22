package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {

        List<Employee> employeesList = Arrays.asList(
                new Employee("trilochan", 22, 11000),
                new Employee("ryan", 22, 10020),
                new Employee("sailen", 22, 10300),
                new Employee("saken", 22, 10030),
                new Employee("ruplu", 22, 10020)
        );

        List<Double> distinctSalaries = employeesList.stream()
                .map(e -> e.getSalary())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctSalaries);
    }
}