public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        int target = -10;

        int found = solve(arr, target, 0, arr.length-1);
        if(found!=-1)System.out.println("Target found at index: "+ found);
        else System.out.println("Target doesn't exist in the array");
        
    }
    private static int solve(int[] arr, int tar, int l, int r){
        if(l>r){
            return -1;
        }
        else{
            // int mid = (l + (r - l)) >> 1;

            int mid = l+ (r-l)/2;

            if(tar < arr[mid]) return solve(arr, tar, l, mid-1);
            else if(tar > arr[mid]) return solve(arr, tar, mid+1, r);
            else return mid;
        }
    }
}
