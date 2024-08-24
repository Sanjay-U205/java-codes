public class LL1{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void insertFront(int data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }
        // newNode.next = null;
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void insertAtKey(int data ,int key){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        // key = 3;
        while(temp!=null){
            if(temp.data == key){
                break;

            }
            temp = temp.next;

        }
        newNode.next=temp.next;
        temp.next = newNode;


    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is Empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public void deleteAtkey(int key){
        if(head == null){
            System.out.println("the list is Empty");
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data==key){
                prev.next = temp.next;
                break;

            }else {
                prev = temp;
                temp = temp.next;
            }

        }
    }
    public static void main(String[] args) {
        LL1 list = new  LL1();
        list.insertFront(2);
        list.insertFront(3);
        list.insertFront(5);
        list.insertLast(9);
        list.printList();
        list.insertAtKey(7,3);
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        list.deleteAtkey(7);
        list.printList();



    }
}