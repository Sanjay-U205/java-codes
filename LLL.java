import java.util.*;

class LLL{
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<String>();
       
        // list.addFirst("is");
        list.addFirst("name");
        list.addFirst("my");
        list.add("sanjay");
        System.out.println(list);
        list.add(2,"is");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        list.remove(3);
        System.out.println(list);
    }
}

// import java.util.LinkedList;;

/*class LL{
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<String>();
       
        // list.addFirst("is");
        list.addFirst("name");
        list.addFirst("my");
        list.add("sanjay");
        System.out.println(list);
        list.add(2,"is");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        list.remove(3);
        System.out.println(list);
    }
}*/