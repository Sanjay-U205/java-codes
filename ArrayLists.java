import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main(String args[]){
        // create a lists
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new arrayLists,string>();
        // ArrayList<Boolean> list3 = new ArrayList<>;
        
        // add elements
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println(list);
        
        // to get an element
        int e = list.get(0);//0 is the index it get the element in the 0th index
        System.out.println(e);
        
        //add element in between
        list.add(1,2);// 1 is the index and 2 is the element to be added
        System.out.println(list);
        
        //set element
        list.set(0,0);
        list.set(1,7);
        System.out.println(list);
        
        //delete elements
        list.remove(0);//0 is the index
        System.out.println(list);
        
        //size of the list
        int size = list.size();
        System.out.println(size);
        
        // loops on lists
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        
        }
        System.out.println();
        
        //sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
        
    }
}