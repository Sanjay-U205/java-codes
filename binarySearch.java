public class binarySearch {
    public static int Binary(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
             /*  int has one problem that might bbe possible that start + end 
             exceeds the range of the integer in java so we can use 
             the below formula to avoid that problem */
             int mid = start + (end - start)/2;
             if(target < arr[mid]){
                end = mid - 1;
             }
             else if(target > arr[mid]){
                start = mid + 1;
             }else{
                return mid;
             }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2, 5,7,9,14,24,28,35,45,56,67,78,89};
        int target = 7;
        int result = Binary(arr, target);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
    
}
