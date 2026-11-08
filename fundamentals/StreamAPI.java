package fundamentals;

/*
7.1 What is Stream API?
Stream API was introduced in Java 8 to process collections in a functional and declarative manner.

It supports operations like:
- filter()
- map()
- flatMap()
- sorted()
- collect()
- reduce()

2 map()
map() transforms each element into another element.

3 flatMap()
flatMap() transforms each element into a stream and flattens the resulting streams into a single stream.

Interview-ready answer
"map() transforms each element independently, whereas flatMap() transforms each element into a
stream and then flattens those streams into a single stream. I use map for simple transformations
and flatMap when working with nested collections."


8. Intermediate vs Terminal Operations
1.Intermediate operations
  - Intermediate operations return another Stream.

Examples:
- filter()
- map()
- flatMap()
- distinct()
- sorted()
- limit()
They are generally lazy, meaning they don't execute the pipeline until a terminal operation is invoked.


2 Terminal operations
  - Terminal operations produce a result or side effect and consume the stream.

Examples:
- collect()
- toList()
- forEach()
- count()
- reduce()
- anyMatch()
- findFirst()
*/

import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<String> names =
                List.of("joe", "john", "david");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);


        List<List<Integer>> numbers = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        List<Integer> result2 = numbers.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(result2);


        List<Integer> numbers2 =
                List.of(10, 20, 30, 40, 50);

        List<Integer> result3 = numbers2.stream()

                .filter(n -> n > 20) // Intermediate

                .map(n -> n * 2)     // Intermediate

                .toList();           // Terminal
    }
}
