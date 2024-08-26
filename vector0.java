// vector is the class of the java legacy class and it is very similar to the arrays
import java.util.*;
public class vector0{
    public static void main(String[] args) {
        Vector v = new Vector();//create a vectoe of the default size
        v.add(1);
        v.add(2);
        v.add("sanjay");
        v.add(4.7);
        System.out.println("Vector is "+v);
        // we can store and print integers , string ,float all at a time 
        // it will convert all values int the string and store them in the same format
        // the one criticisum of this vertor class is the name of the programs are very big eg void removeAllElements();
    }
}