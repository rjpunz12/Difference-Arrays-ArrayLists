import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {
        // Arrays
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));

        // ArrayLists
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("ArrayList: " + arrayList);

        // Accessing elements
        int elementFromArray = array[2];
        int elementFromArrayList = arrayList.get(2);
        System.out.println("Element at index 2 in array: " + elementFromArray);
        System.out.println("Element at index 2 in ArrayList: " + elementFromArrayList);

        // Modifying elements
        array[2] = 10;
        arrayList.set(2, 10);
        System.out.println("Modified array: " + Arrays.toString(array));
        System.out.println("Modified ArrayList: " + arrayList);

        // Size
        int sizeOfArray = array.length;
        int sizeOfArrayList = arrayList.size();
        System.out.println("Size of array: " + sizeOfArray);
        System.out.println("Size of ArrayList: " + sizeOfArrayList);

        // Adding elements
        // Arrays cannot dynamically grow, so a new array must be created
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = 6;
        System.out.println("New array with added element: " + Arrays.toString(newArray));

        // ArrayLists can dynamically grow
        arrayList.add(6);
        System.out.println("New ArrayList with added element: " + arrayList);

        // Iterating through elements
        System.out.println("Iterating through array elements:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nIterating through ArrayList elements:");
        for (int value : arrayList) {
            System.out.print(value + " ");
        }
    }
}