package fundamentals;


/*

1. How does HashMap work internally in Java?
Interview-ready answer:
HashMap stores data in key-value pairs. Internally, it uses an array of buckets.
When we insert a key-value pair, HashMap calculates the hash of the key and determines the bucket index.
If multiple keys map to the same bucket, a collision occurs. Java handles collisions using a linked list,
which can be converted into a balanced red-black tree when certain thresholds are reached.

Step 3: What happens when a collision occurs?

Suppose two different keys generate the same bucket index.
Java initially uses a linked list for collisions.

When the bucket becomes sufficiently populated, it can be converted into a red-black tree.

Important thresholds:
- Treeification threshold: 8.
- Minimum table capacity for treeification: 64.
- Otherwise, HashMap generally resizes instead.

Step 4: What happens during resizing?
Default initial capacity = 16.

Default load factor = 0.75.

Threshold:
\[
16 \times 0.75 = 12
\]

When the number of entries exceeds the resize threshold, HashMap generally doubles its capacity.

2.Suppose two different objects have the same hashCode(). What happens when we insert both objects into a HashMap?
When two keys map to the same bucket, a hash collision occurs. HashMap handles collisions
using a linked list initially, which can become a red-black tree when the treeification conditions are satisfied.
While inserting a new entry, HashMap compares the hash values and checks key equality using reference equality
or the equals() method.If the keys are equal, the existing value is replaced.
If they are different, the new entry is added to the bucket.

Important corrections
Correction 1: ConcurrentModificationException
  - This exception is not specifically caused by multiple threads accessing a HashMap.
  - It commonly occurs when a collection is structurally modified while being iterated using a fail-fast iterator.

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Java");
    map.put(2, "Spring");

    for (Integer key : map.keySet()) {
        map.put(3, "React"); // May throw ConcurrentModificationException
    }

Correction 2: Java 8 ConcurrentHashMap internals

Java 8 does not use segment-based locking.
- If a bucket is empty, it can use CAS to insert a node.
- If multiple threads contend for the same bucket, it uses synchronized on that bucket's first node.
- Different buckets can generally be updated concurrently.
- Reads are mostly non-blocking.

Correction 3: It doesn't guarantee that ConcurrentModificationException will never occur.
Its iterators are weakly consistent. They don't throw ConcurrentModificationException during concurrent modifications,
but they may or may not reflect updates made while iteration is in progress.


* 3. Interview-ready answer
*You can explain it like this:
*HashMap is not thread-safe, so concurrent modifications by multiple threads can lead to race conditions
*and inconsistent data.To handle concurrent access, we use ConcurrentHashMap.

*In Java 7, ConcurrentHashMap used segment-based locking, where the map was divided into multiple segments,
*allowing different segments to be accessed concurrently.

*From Java 8 onwards, it uses CAS operations for inserting into empty buckets and fine-grained synchronization
*at the bucket level when there is contention. This allows multiple threads to work on different
*buckets concurrently without locking the entire map.


4. Follow-up interview question
Let's test whether you understand the practical difference.

Suppose two threads execute this code simultaneously:

if (!map.containsKey("user1")) {
    map.put("user1", "Joe");
}

Assume map is a ConcurrentHashMap.

Can this code still cause a race condition? Why?

ans ->
yes, it can still cause a race condition, even with ConcurrentHashMap.
magine two threads execute the code simultaneously:

  - Thread 1 checks containsKey() → key doesn't exist.
  - Thread 2 checks containsKey() → key doesn't exist.
  - Thread 1 inserts "user1" → "Joe".
  - Thread 2 also inserts "user1" → "Joe".

Both threads passed the check. The problem is that containsKey() and put() are two separate operations.
ConcurrentHashMap makes individual operations thread-safe, but doesn't automatically make this entire sequence atomic.


How do we fix it?
Use putIfAbsent():
map.putIfAbsent("user1", "Joe");
ConcurrentHashMap makes individual operations thread-safe, but multiple operations together are not necessarily atomic.
For compound operations, we should use atomic methods such as putIfAbsent(), computeIfAbsent(), or merge().

*/

public class ConcurrentHashMap {

    public static void main(String[] args) {

    }
}
