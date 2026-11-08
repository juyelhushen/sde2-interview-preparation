package fundamentals;

import java.util.HashSet;
import java.util.Set;

/*

14.1 What is equals()?
The equals() method checks whether two objects are logically equal.

4.2 What is hashCode()?
The hashCode() method returns an integer representing the object's hash value.
Hash-based collections use this value to locate a bucket efficiently.

3 The contract
There are two essential rules:
  a. If two objects are equal according to equals(), they must have the same hashCode().
  b. If two objects have the same hashCode(), they are not necessarily equal.


4.What happens if we override equals() but not hashCode()?
This is a classic interview trap.

Two logically equal objects might produce different hash codes.

HashMap could place them in different buckets.

Consequently, HashSet might allow both objects, even though equals() considers them equal.

Interview-ready answer:

equals() checks logical equality, whereas hashCode() provides a hash value used by hash-based collections.
If two objects are equal according to equals(), they must have the same hashCode.
However, the reverse is not guaranteed. Both methods should be overridden together
when defining logical equality for custom objects.

*/
public class EqualsAndHashcode {

    static class Employee {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (!(obj instanceof Employee)) return false;
            Employee other = (Employee) obj;

            return this.id == other.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee(101, "Joe"));
        employees.add(new Employee(101, "John"));

        System.out.println(employees.size());
        //output 1
        //Because both objects have the same ID and are logically equal according to our implementation.
    }
}
