public class InsertionSort {
    public static void iSort(int[] nums){
        int n = nums.length;

        for(int i = 1 ; i < n ; i++){
            int key = nums[i];
            int j = i-1 ;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,7,14,19,2,17,10,11,1};
        System.out.println("Before Sorting : ");
        for(int ele : nums){
            System.out.print(ele + " ");
        }
        iSort(nums);
        System.out.println("\nAfter Sorting : ");
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}