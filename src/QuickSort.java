public class QuickSort {
    public static void qSort(int[] arr,int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            qSort(arr,low,pivot-1);
            qSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1 ;
        for(int j=low ; j<high ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    // DIVIDE AND CONQUER -
    public static void main(String[] args) {
        int[] arr = {4,7,14,19,2,17,10,11,1};
        System.out.println("Before Sorting : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        qSort(arr,0,arr.length-1);
        System.out.println("\nAfter Sorting : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
