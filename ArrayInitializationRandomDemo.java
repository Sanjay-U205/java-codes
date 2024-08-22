import java.util.*;

public class ArrayInitializationRandomDemo {
    int a[] = new int [100];
    int size;
    int MIN = 1, MAX = 100;
    int generateRandom(int min,int max)
    int rand = (int)(Math.random()*((max - min)+1))+min;
    returnrand;

    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size <100");
    size = sc.nextInt();
    for(int i = 0;i<size;i++){
        a[i] = generateRandom(MIN,MAX);
    }
    System.out.println("Capacity = "+args.length+"size:="+size);
    System.out.println(a);
}
