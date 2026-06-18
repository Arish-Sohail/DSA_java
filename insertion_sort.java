public class insertion_sort {
    public static void main(String[] args) {
        int[] array={2,14,4,5,6};
        array=insertionSort(array);
        for (int a:array){
            System.out.print(a+" ");
        }
    }

    static int[] insertionSort(int[] arr){
        for (int i = 1; i<arr.length;i++){
            int j=i;
            int temp=arr[i];
            while (j>0 && temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }  
            arr[j]=temp;
        }
        return arr;
    }
}
