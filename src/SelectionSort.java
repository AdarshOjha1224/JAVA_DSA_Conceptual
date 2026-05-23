public class SelectionSort {
    public static void sSort(int[] nums){
        int n = nums.length;
        int temp = 0 ;
        int minIndex = -1 ;

        for(int i = 0 ; i < n-1 ; i++){
            minIndex = i ;
            for(int j = i+1 ; j < n ; j++){
                if(nums[minIndex] > nums[j]) minIndex = j ;
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp ;
            System.out.println();
            for(int ele : nums) System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,7,14,19,2,17,10,11,1};
        System.out.println("Before Sorting : ");
        for(int ele : nums){
            System.out.print(ele + " ");
        }
        sSort(nums);
        System.out.println("\nAfter Sorting : ");
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}
