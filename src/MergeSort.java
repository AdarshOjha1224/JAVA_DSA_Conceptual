public class MergeSort {
    public static void mSort(int[] arr ,int left ,int right){
        if(left<right){
            int mid = (left+right)/2;
            mSort(arr,left,mid);
            mSort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {

        int a1 = mid-left+1;
        int a2 = right-mid;

        int[] leftArray = new int[a1];
        int[] rightArray = new int[a2];

        for(int x = 0; x < a1 ; x++){
            leftArray[x] = arr[left+ x];
        }
        for(int x = 0; x < a2 ; x++){
            rightArray[x] = arr[mid+1+ x];
        }

        int i = 0 , j = 0 , k = left ;

        while(i<a1 && j<a2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<a1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<a2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,7,14,19,2,17,10,11,1};
        System.out.println("Before Sorting : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        mSort(arr,0,arr.length-1);

        System.out.println("\nAfter Sorting : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}