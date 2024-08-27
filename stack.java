public class Stack {
    class Stack1 {
        int[] data;
        int length;
        int top;

        Stack1(int size) {
            data = new int[size];
            length = size;
            top = -1;
        }
        
        void push(int a) {
            if (top < length - 1) {
                top++;
                data[top] = a;
            } else {
                System.out.println("Stack overflow");
            }
        }

        int pop() {
            int a = 0;
            if (top == -1) {
                System.out.println("Stack underflow");
                return -1; // Return a default value for underflow
            } else {
                a = data[top];
                top--;
            }
            return a;
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Stack stackInstance = new Stack();
        Stack1 s = stackInstance.new Stack1(10); // Create a Stack1 instance with a size

        s.push(1);
        s.push(3);
        System.out.println(s.pop()); // Print the value being popped
        s.push(5);
    }
}
