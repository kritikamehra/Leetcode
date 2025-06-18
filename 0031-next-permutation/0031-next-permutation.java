class Solution {
   
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
            }
        }

        int next = -1;
    
        if(pivot != -1) {
            for(int i = nums.length-1; i > pivot; i--) {
                if(nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }
        Arrays.sort(nums,pivot+1,nums.length);
    }
}