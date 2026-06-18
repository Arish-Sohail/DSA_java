


public class revision{
    public static void main(String[] args) {
        int[] ar = {9,3,5,2,7,6,8,4,1};
        
        printList(ar);
        printList(bubbleSort(ar));
        printList(selectionSort(ar));
        printList(insertionSort(ar));
    }


    static void printList(int[] arr){
        for (int a: arr){
            System.out.print(a+ " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    static int[] bubbleSort(int[] arr){
        System.out.println("Bubble Sort");
        for (int i = 0; i < arr.length-1; i++){   
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr){
        System.out.println("Selection Sort");
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++){
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

    static int[] insertionSort(int[] arr){
        System.out.println("Insertion Sort");
        for (int i = 0; i<arr.length;i++){
            int temp = arr[i];
            int j = i;
            while (j>0 && temp < arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        return arr;
    }



}