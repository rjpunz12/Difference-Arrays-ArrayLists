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
