import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,3,7};
        
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }
    private static void bubbleSort(int[] arr,int n){
        if(n == 1){
            return ;
        }
        boolean swapped = solve(arr,0,n);
        if(!swapped) return ;
        bubbleSort(arr, n-1);

    }
    private static boolean solve(int[] arr, int i , int n){
        if(i == n-1)return false;// the index has reached its limit...

        boolean swapped = false;
        if(arr[i] > arr[i+1]){
            arr[i] = arr[i]^ arr[i+1];
            arr[i+1] = arr[i]^ arr[i+1];
            arr[i] = arr[i]^ arr[i+1];
            swapped = true;
        }
        return swapped|| solve(arr,i+1,n);

        
    }
}
