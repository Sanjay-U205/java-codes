//build a tree from its preoredr traversal
import java.util.*;
public class BinaryTreeYT{
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this .data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    } 
    // preorder
public static void preorder(Node root){
    if(root == null){
        System.out.print(-1+" ");
        return;
    }
    System,out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}
//inorder
public static void inorder(Node root){
    if(root == null){
        System.out.print(-1+" ");
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
//postorder
public static void postorder(Node root){
    if(root == null){
        System.out.print(-1+" ");
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}
// levelorder
public static void levelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.Empty()){
        Node curr = q.remove();
        if(curr == null){
            System.out.println();
            //queue empty
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(curr.data+" ");
            if(curr.left !=null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}
//count of nodes time complxity O(n)
public static int countofNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftNodes = countofNodes(root.left);
    int rightNodes = countofNodes(root.right);
    
    return leftNodes + rightNodes + 1;
}
//sum of nodes
public static int sumOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftSum = sumOfNodes(root.left);
    int rightSum = SumOfNodes(root.right);
    
    return leftSum + rightSum + root.data;
}
//height of tree
public static int height(Node root){
    if(root == null){
        return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    
    int myHeight = Math.max(leftHeight, rightHeight) + 1;
    return myHeight;
}
//diameter of the tree
// Number of Nodes in thr Longest path between any 2 nodes
// case O(n^2)
public static int diameter(Node root){
    if(root == null){
        return 0;
    }
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = height(root.left) + height(root.right) + 1;
    return Math.max(diam3, Math.max(diam1, diam2));
}
// case O(N)
static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht,int diam){
        this.ht = ht;
        this.diam = diam;
    }
}
public static TreeInfo(root.left);

if(root == null){
    new TreeInfo(0,0);
}
TreeInfo right = diameter2(root.left);
TreeInfo right = diameter2(root.right);
int myHeight = Math.max(left.ht, right.ht) + 1;
int diam1 = left.diam;
int diam2 = right.diam;
int diam3 = left.ht + right.ht + 1;
int mydiam = Mtah.max(Math.max(diam1,diam2),diam3);

TreeInfo myInfo =  new TreeInfo(myHeight,mydiam);
return myInfo;
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println(countofNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
    }
}