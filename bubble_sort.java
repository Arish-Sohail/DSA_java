

public class bubble_sort {
    public static void main(String[] args) {
        int[] array={2,14,4,5,6};
        array=bubblSort(array);
        for (int a:array){
            System.out.print(a+" ");
        }
    }
    static int[] bubblSort(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            
            for (int j =0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
