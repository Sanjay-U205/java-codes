// insertion into the 1D array
import java.util.*;
public class Insertion1DArray{
   static int a [] = new int [100];
     static int  size = 0;
    public static   void   create(int inputSize){
        if(size>100){
            System.out.println("could not initialize...");
            return ;
            
        }
         size = inputSize;//update the size
        Scanner sc = new Scanner (System.in);
        for(int i = 0;i<size;i++){
            System.out.println("Enter "+(i+1)+"th number");
            a [i] = sc.nextInt();
            
        }
        System.out.println("Capacity = "+ a.length + "Size + "+size);
        System.out.println("Array contents: " + Arrays.toString(Arrays.copyOf(a, size)));
    }
    public static void  insert(int item, int loc){
        if(size == a.length){
            System.out.println("Array is overflow : Insertion fails...");
            return ;
        }
        if((loc < 0) || (loc > size)){
            System.out.println("Out of range : Insertion fails...");
            return ;
        }
        // Shift elements to the right to make space for the new element
        for (int i = size; i > loc; i--) {
            a[i] = a[i - 1];
        }
        a[loc] = item; // Insert the new element
        size++; // Update size after insertion
        System.out.println("Capacity = " + a.length + ", Size = " + size);
        System.out.println("Array contents: " + Arrays.toString(Arrays.copyOf(a, size)));
    }
    // the main method 
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        create(n);
        
        System.out.println("Enter the new number to be inserted:");
        int newItem = sc.nextInt();
        System.out.println("At position ?");
        int pos = sc.nextInt();
        insert (newItem , pos);
        System.out.println("Capacity = "+a.length +"Size +"+size);
       System.out.println("Array contents: " + Arrays.toString(Arrays.copyOf(a, size)));
    }
}