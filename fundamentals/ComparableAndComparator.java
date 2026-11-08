package fundamentals;

/*

1. Comparable
  - Comparable defines the natural ordering of objects.
  - It is implemented inside the class itself.
  - It is present in java lang package

2. Comparator
   - Comparator defines external/custom sorting logic.
   - it is present in the utils package

3 Differences
Comparable	                Comparator
compareTo()	                compare()
Natural ordering	        Custom ordering
Implemented in the class	Can be external
One natural ordering	    Multiple sorting strategies

Interview-ready answer
Comparable is used to define natural ordering inside a class using compareTo().
Comparator is used to define custom sorting logic externally using compare().
Comparator is more flexible because we can create multiple sorting strategies without modifying the original class.

*/

import java.util.*;

public class ComparableAndComparator {

    static class Employee implements Comparable<Employee> {
        int salary;

        public Employee(int salary) {
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee o) {
            return Integer.compare(this.salary, o.salary);
        }
    }


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1000), new Employee(5000),
                new Employee(6000));
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees.toString());


        employees.sort(
                Comparator.comparingInt((Employee e) -> e.salary).reversed()
        );

    }
}
