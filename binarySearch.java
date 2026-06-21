public class binarySearch {
    static boolean binerySearch(int[] arr, int t){
        return bsHelper(arr,t,0,arr.length);
    }
    static boolean bsHelper(int[] arr, int t, int l, int r){
        int mid = l + (r-l)/2;
        if (l>r){
            return false;
        }
        else if (t<arr[mid]){
            return bsHelper(arr,t,l,mid-1);
        }
        else if (t>arr[mid]){
            return bsHelper(arr,t,mid+1,r);
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binerySearch(arr, 4));
    }
}
