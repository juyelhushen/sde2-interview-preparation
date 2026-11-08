package fundamentals;


/*

1 Internal structure
ArrayList: Uses a dynamically resizable array.Contiguous array-based storage.
LinkedList: Uses a doubly linked list.Nodes connected by previous and next references.

2 Differences
Operation	                ArrayList	    LinkedList
Get by index	            O(1)	        O(n)
Add at end	                Amortized O(1)	O(1)
Add at beginning	        O(n)	        O(1)
Remove from beginning	    O(n)	        O(1)
Search by value	            O(n)	        O(n)
Memory overhead	            Lower	        Higher

Note: Removing or inserting in the middle of a LinkedList still requires locating the node,
which takes O(n) when starting from an endpoint.

5.4 When should you use them?
- ArrayList: Most common application scenarios involving frequent reads and indexed access.
- LinkedList: Useful when frequent insertions/removals happen at the ends, though ArrayDeque
  is often a better choice for queue/deque workloads.

Interview-ready answer
"ArrayList uses a dynamic array and provides O(1) random access. LinkedList uses a doubly linked list
and provides O(1) insertion or removal at its ends. ArrayList is generally preferred in application
development because of better cache locality and lower memory overhead."


*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsLinkedList {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Angular");

        System.out.println(list.get(1));


    }
}
