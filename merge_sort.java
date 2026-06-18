public class merge_sort {
    public static void main(String[] args) {
        int[] ar = {9,3,5,2,7,6,8,4,1};
        ar = mergeSort(ar);
        for (int a : ar){
            System.out.print(a+" ");
        }
    }

    static int[] mergeSort(int[] arr){
        int middle=arr.length/2;
        int[] larr = new int[middle];
        int[] rarr = new int[arr.length - middle];
        for (int i = 0; i<middle;i++){
            larr[i]=arr[i];
        }
        for (int i = middle; i<arr.length; i++){
            rarr[i-middle]=arr[i];
        }
        if (middle>=1){
            mergeSort(larr);
            mergeSort(rarr);
        }
        merge(larr, rarr, arr);
        
        return arr;
    }

    static void merge(int[] larr, int[] rarr, int[] arr){
        int i = 0;
        int j = 0;
        int a = 0;
        while (i<larr.length && j<rarr.length){
            if (larr[i]<rarr[j]){
                arr[a]=larr[i];
                i++;
                a++;
            }
            else{
                arr[a]=rarr[j];
                j++;
                a++;
            }
        }
        while (i<larr.length){
            arr[a]=larr[i];
            i++;
            a++;
        }
        while (j<rarr.length){
            arr[a]=rarr[j];
            j++;
            a++;
        }
    }
}
