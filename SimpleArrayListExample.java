/*public class SimpleArrayListExample {
public static void main(String[] args) {
// Creating an ArrayList of String
ArrayList<String> alist = new ArrayList <> ();
// Adding new elements to the ArrayList
alist.add("Lion");
alist.add("Tiger");
alist.add("Cat");
alist.add("Dog");
// animals.add(2019); Is it valid?
// This shows how an entire collection can be displayed
System.out.println(alist);
}
}
//An arrayList object is collection of the homogeneous objects.
//Adding an object of another type invites compile-time error or runtime error
*/
import java.util.ArrayList;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> ani = new ArrayList<>();
        ani.add(2);  // Correct way to use the add method
        ani.add(3);  // Correct way to use the add method
        ani.add(5);  // Correct way to use the add method
        ani.add(4);  // Correct way to use the add method
        System.out.println(ani);
        
        ArrayList<Integer> alist = new ArrayList<Integer>(ani);
        alist.add(12);
        alist.add(14);
        System.out.println(ani);
        System.out.println(alist);
        
    }
}

