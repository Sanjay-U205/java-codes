public class orderAgnesticBS {
    public static int orderAgnosticBS(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        int target = 66;
        int result = orderAgnosticBS(arr, target);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
