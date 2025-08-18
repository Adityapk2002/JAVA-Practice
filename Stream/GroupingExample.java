package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;
    double salary;

    Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

}

public class GroupingExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 50000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "Finance", 55000),
                new Employee("Eve", "HR", 65000));

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.averagingDouble(e -> e.salary)));

        avgSalaryByDept.forEach((dept, avg) -> System.out.println(dept + "->" + avg));
    }
}
