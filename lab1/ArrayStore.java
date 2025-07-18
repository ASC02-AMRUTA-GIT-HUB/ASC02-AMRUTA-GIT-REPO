package co.demo.lab1;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.*;

public class ArrayStore {
    private int[] arr = new int[10];
    private int currentSize = 10;


    //Accept and display 10 integers
    public void acceptElements(Scanner scanner) {

        System.out.println("enter 10 intigers");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
       }
    }

    public void displayWithWhile() {
        System.out.println("Elements (using while loop):");
        int i = 0;
        while (i < currentSize) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // 2. Display elements using for loop
    public void displayWithFor() {
        System.out.println("Elements (using for loop):");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(arr, 0, currentSize);
        System.out.println("Array Sorted");
    }

    public int countOccurrences(int number) {
        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }

        public void insertAt(int number, int position) {
        if (position < 0 || position > currentSize || currentSize == arr.length) {
            System.out.println("Invalid position or array is full.");
            return;
        }
        // Expand array size by 1 if needed
        arr = Arrays.copyOf(arr, currentSize + 1);

            for (int i = currentSize; i > position; i--) {
                arr[i] = arr[i - 1];
            }

            arr[position] = number;
            currentSize++;
            System.out.println("Number inserted at position " + position);
        }

    // 6. Return array with unique elements (no duplicates, maintain order of first occurrences)
    public int[] getUniqueArray() {
        List<Integer> uniqueList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < currentSize; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                uniqueList.add(arr[i]);
            }
        }

        // Convert to array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }

    // Display any integer array
    public static void displayArray(int[] array) {
        System.out.println("Array contents:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // MAIN method to demonstrate functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStore store = new ArrayStore();

        store.acceptElements(scanner);
        store.displayWithWhile();
        store.displayWithFor();

        store.sortArray();
        store.displayWithFor();

        System.out.print("Enter a number to count its occurrences: ");
        int num = scanner.nextInt();
        int count = store.countOccurrences(num);
        System.out.println(num + " occurs " + count + " times.");

        System.out.print("Enter a number to insert: ");
        int numberToInsert = scanner.nextInt();
        System.out.print("Enter the position to insert at (0-based): ");
        int position = scanner.nextInt();
        store.insertAt(numberToInsert, position);
        store.displayWithFor();

        System.out.println("Array with duplicates removed:");
        int[] unique = store.getUniqueArray();
        displayArray(unique);
    }

}
