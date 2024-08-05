import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        // int []marks=new int[30];
        // int []marks={83,63,837,73};
        // for(int i=0;i<4;i++){
        int marks[]=new int[size];
        //linear search
        int x=sc.nextInt();
    for(int i=0;i<marks.length;i++){
        if(marks[i]==x){
            System.out.println("marks found");
        }
        else{
            System.out.println("not found");
        }
        }
    }
}