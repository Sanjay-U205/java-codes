// This example shows:
// How to check if an ArrayList is empty using the method isEmpty().
// How to find the size of an ArrayList using the size() method.
// How to access the element at a particular index in an ArrayList using the get() method.
//How to modify the element at a particular index in an ArrayList using the set() method.
import java.util.ArrayList;
public class AccessingArrayListObjects{
public static void main(String[] args) {
ArrayList <String> topCompanies = new ArrayList <String>();
// Check if an ArrayList is empty
System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
topCompanies.add("Google");
topCompanies.add("Apple");
topCompanies.add("Microsoft");
topCompanies.add("Amazon");
topCompanies.add("Facebook");
// Find the size of an ArrayList
System.out.println("Here are the top " + topCompanies.size() + “Companies in the world");
System.out.println(topCompanies); // Print the companies names
// Retrieve the element at a given index
String bestCompany = topCompanies.get(0);
System.out.println("Best Company: " + bestCompany);
String secondBestCompany = topCompanies.get(1);
System.out.println("Second Best Company: " + secondBestCompany);
String lastCompany = topCompanies.get(topCompanies.size() - 1);
System.out.println("Last Company in the list: " + lastCompany);
// Modify the element at a given index
topCompanies.set(4, "Walmart");
System.out.println("Modified top companies list: " + topCompanies);
}
}

