public class quick_sort_me {
    public static void main(String[] args) {
        int[] ar = {9,3,1,2,7,6,8,4,5};
        ar=quickSort(ar,0, ar.length-1);
        sout(ar);
    }

    static void sout(int[] arr){
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    static int[] quickSort(int[] arr,int h,int g){
        int j=h;
        int i=j-1;
        int l=g;
        while (j<=l) {
            if (arr[j]<=arr[l]){
                int temp = arr[++i];
                arr[i]=arr[j];
                arr[j++]=temp;
            }
            else{
                j++;
            }
        }

        if (g-h>0){
            quickSort(arr, h, i-1);
            quickSort(arr, i+1, g);
        }
        return arr;
    }
}
