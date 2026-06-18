public class quick_sort_standerd {
    public static void main(String[] args) {
        int[] ar = {9,3,1,2,7,6,8,4,5};
        quickSort(ar, 0, ar.length-1);
        sout(ar);
    }    

    static void sout(int[] arr){
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    static void quickSort(int[] arr, int s, int e){
        
        if (s>=e){
            return;
        }
        int pi = partition(arr, s, e);

        quickSort(arr, s, pi-1);
        quickSort(arr, pi+1, e);
    }

    static int partition(int[] arr, int s, int e){
        int i = s-1;
        int p = arr[e];
        for (int j=s;j<e;j++){
            if (arr[j]<=p){
                int temp = arr[++i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[++i];
        arr[i]=arr[e];
        arr[e]=temp;
        return i;
    }
}