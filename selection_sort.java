public class selection_sort {
    public static void main(String[] args) {
        int[] array={2,14,4,5,6};
        array=selectionSort(array);
        for (int a:array){
            System.out.print(a+" ");
        }
    }
    static int[] selectionSort(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            int min=i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
}
