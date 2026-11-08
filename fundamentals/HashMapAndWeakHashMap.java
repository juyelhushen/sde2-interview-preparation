package fundamentals;

import java.util.HashMap;
import java.util.WeakHashMap;


//WeakHashMap is a special implementation of the Map interface in Java where the keys are stored as weak references.
// Unlike a standard HashMap, which prevents its keys from being garbage collected,
// a WeakHashMap allows the garbage collector (GC) to reclaim a key object if there are no other strong references
// pointing to it.

public class HashMapAndWeakHashMap {

    static class KeyObject {
        private String name;

        public KeyObject(String name) { this.name = name; }

        @Override
        public String toString() { return name; }
    }

    public static void main(String[] args) throws InterruptedException {
        HashMap<KeyObject, String> regularMap = new HashMap<>();
        WeakHashMap<KeyObject, String> weakMap = new WeakHashMap<>();

        // 2. Create the key objects (Strong references)
        KeyObject key1 = new KeyObject("RegularKey");
        KeyObject key2 = new KeyObject("WeakKey");

        // 3. Put them into maps
        regularMap.put(key1, "Metadata 1");
        weakMap.put(key2, "Metadata 2");

        System.out.println("Before GC - Regular Map: " + regularMap);
        System.out.println("Before GC - Weak Map: " + weakMap);


        // 4. Nullify the strong external references
        key1 = null;
        key2 = null;

        // 5. Explicitly request Garbage Collection
        System.gc();
        Thread.sleep(1000); // Give GC a moment to execute

        // 6. Check the results
        System.out.println("\nAfter GC - Regular Map: " + regularMap);
        System.out.println("After GC - Weak Map: " + weakMap);
    }
}
