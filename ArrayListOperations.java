import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    // Method to insert an element at a specified position
    public static void insertElement(List<Integer> list, int position, int element) {
        if (position < 0 || position > list.size()) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        list.add(position, element);
    }

    // Method to delete an element from a specified position
    public static void deleteElement(List<Integer> list, int position) {
        if (position < 0 || position >= list.size()) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        list.remove(position);
    }

    // Main method to test the insertion and deletion
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Adding initial elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        // Inserting an element
        insertElement(list, 2, 99); // Insert 99 at position 2
        System.out.println("List after insertion: " + list);

        // Deleting an element
        deleteElement(list, 3); // Delete element at position 3
        System.out.println("List after deletion: " + list);
    }
}
 
