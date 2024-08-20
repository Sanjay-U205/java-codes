import java.util.*; 
public class QuickSortDemo 
{ 
    static void quickSort(int[] a,int low,int high)  
 { 
  if(low<high) 
     {int pidx=partition(a,low,high); 
   quickSort(a,low,pidx-1); 
   quickSort(a,pidx+1,high); 
     }  
 } 
 static int partition(int[] a,int low,int high)  // partition method  
 { 
  int pivot=a[high]; 
  int i=low-1; 
  for(int j=low;j<high;j++) 
  { 
   if(a[j]<=pivot) 
   { 
    i++; 
    //swap
    int temp=a[i]; 
    a[i]=a[j]; 
    a[j]=temp; 
   } 
  } 
  i++; 
  int temp=a[i]; 
  a[i]=pivot; 
  a[high]=temp; 
  return i; 
   
 } 
static void display(int[] a)  // method to display the array 
 { 
  for(int i=0;i<a.length;i++) 
   System.out.println(a[i]+" "); 
 } 
 public static void main(String[] args) // main method  
 { 
  Scanner sc=new Scanner(System.in); 
  System.out.println("enter size of array"); 
                int n=sc.nextInt(); 
  int[] a =new int[n]; 
   
                System.out.println("enter the elements of array"); 
  for(int i=0;i<a.length;i++) 
     a[i]=sc.nextInt(); 
                quickSort(a,0,n-1); 
                System.out.println("Array after sorting the elements: "); 
                display(a); 
 } 
} 