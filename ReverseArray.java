// public class evod {
//    public static void main(String args[]) {
//        int n = 5;


//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                if((i+j) % 2 == 0) {
//                    System.out.print(1+" ");
//                } else {
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }
//    }
// }
public class ReverseArray {

    // Method to reverse the array using recursion
    public static void reverseArray(int[] array, int start, int end) {
        // Base case: if the start index is greater than or equal to the end index, stop recursion
        if (start >= end) {
            return;
        }

        // Swap the elements at start and end indices
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // Recursive call with updated indices
        reverseArray(array, start + 1, end - 1);
    }

    // Helper method to initiate the recursive reverse operation
    public static void reverseArray(int[] array) {
        reverseArray(array, 0, array.length - 1);
    }

    // Main method to test the reverse functionality
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Reverse the array
        reverseArray(array);

        System.out.println("Reversed array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
