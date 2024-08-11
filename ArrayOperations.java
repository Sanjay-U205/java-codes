import java.util.Arrays;

public class ArrayOperations {
    
    // Method to insert an element at a specified position
    public static int[] insertElement(int[] array, int position, int element) {
        if (position < 0 || position > array.length) {
            throw new ArrayIndexOutOfBoundsException("Position out of bounds");
        }
        
        int[] newArray = new int[array.length + 1];
        
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        
        newArray[position] = element;
        
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        
        return newArray;
    }
    
    // Method to delete an element from a specified position
    public static int[] deleteElement(int[] array, int position) {
        if (position < 0 || position >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Position out of bounds");
        }
        
        int[] newArray = new int[array.length - 1];
        
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        
        for (int i = position + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        
        return newArray;
    }
    
    // Main method to test the insertion and deletion
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Inserting an element
        array = insertElement(array, 2, 99); // Insert 99 at position 2
        System.out.println("Array after insertion: " + Arrays.toString(array));
        
        // Deleting an element
        array = deleteElement(array, 3); // Delete element at position 3
        System.out.println("Array after deletion: " + Arrays.toString(array));
    }
}

