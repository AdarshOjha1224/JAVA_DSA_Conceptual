public class bubbleSort {
    public static void bSort(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,7,14,19,2,17,10,11,1};
        System.out.println("Before Sorting : ");
        for(int ele : nums){
            System.out.print(ele + " ");
        }
        bSort(nums);
        System.out.println("\nAfter Sorting : ");
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}
