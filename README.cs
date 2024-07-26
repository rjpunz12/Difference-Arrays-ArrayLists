# Difference-Arrays-ArrayLists

## Description

This project demonstrates the differences between Arrays and ArrayLists in Java.

### Arrays
Arrays in Java are fixed-size data structures that can hold elements of a single data type. They are indexed-based, allowing for efficient access to elements using their index. Arrays provide a way to store multiple values in a single variable, which can be useful for tasks that require the storage of a collection of similar items. However, once an array is created, its size cannot be changed, which can be a limitation if the number of elements is not known in advance.

### ArrayLists
ArrayLists in Java are part of the `java.util` package and provide a more flexible alternative to arrays. An ArrayList can dynamically resize itself as elements are added or removed. Unlike arrays, ArrayLists can only store objects, which means primitive data types must be wrapped in their corresponding wrapper classes (e.g., `int` becomes `Integer`). ArrayLists offer various methods for manipulating the list, such as adding, removing, and searching for elements.

### Conceptual Differences
1. **Size:** Arrays have a fixed size, while ArrayLists can dynamically resize.
2. **Type:** Arrays can hold primitive data types directly, while ArrayLists can only hold objects.
3. **Performance:** Arrays are faster for accessing elements due to direct indexing, while ArrayLists may have a slight overhead due to resizing and method calls.
4. **Flexibility:** ArrayLists provide more flexibility with built-in methods for manipulation, whereas arrays require manual handling for such operations.

## Code Example

```java
import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Array Example
        int[] intArray = new int[5]; // Fixed size
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        
        // Accessing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // ArrayList Example
        ArrayList<Integer> intList = new ArrayList<>(); // Dynamic size
        intList.add(10); // Adding elements
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        
        // Accessing ArrayList elements
        System.out.println("ArrayList elements:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        // Demonstrating dynamic resizing
        intList.add(60);
        System.out.println("ArrayList elements after adding another element:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
