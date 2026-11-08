package fundamentals;

/*

1 What is Optional?
Optional was introduced in Java 8 to represent a value that may or may not be present.

It helps avoid unnecessary null checks and NullPointerExceptions.

Interview-ready answer
Optional is a container object that represents the presence or absence of a value.
It helps make null handling explicit and reduces accidental NullPointerExceptions.
I commonly use it as a return type when a method may not find a result.

*/
public class Optional {

    static String getName() {
        return "Juyel";
    }

    static java.util.Optional<String> getName2() {
        return java.util.Optional.of("Juyel");
    }

    public static void main(String[] args) {
        String name = getName();

        if (name != null) {
            System.out.println(name.toUpperCase());
        }

        java.util.Optional<String> name2 = getName2();

        name2.ifPresent(
                value -> System.out.println(value.toUpperCase())
        );
    }
}
