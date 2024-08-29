// //implentation of stack using collection framework

// import java.util.Stack;
// public class StackCollection{
//  public static void main(String args[]){
//         Stack <Integer> s = new Stack<Integer>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             System.out.println("search operation"+s.search(2));
//             s.pop();
//         }
//      }
// }

import java .util.Stack;
public class StackCollection{
    public static void main(String[] args) {
        String [] expArray = {"a","+","b","*"};
        Stack<String> stack = new Stack<String>();
        for(String s : expArray){
            stack.push(s);

        }
        System.out.println("the stack is:"+stack);
        stack.push("dh");
        stack.push("gf");
        System.out.println("search the item:"+stack.search("dh"));
    }
}