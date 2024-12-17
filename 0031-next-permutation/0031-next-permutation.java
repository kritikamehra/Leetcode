class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;

        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        int ele = 0;
        if(pivot != -1) {
            for(int i = nums.length-1; i > pivot; i--) {
                if(nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    // Collections.swap(nums,i,pivot);
                    break;
                }
            }
        }
        Arrays.sort(nums,pivot+1,nums.length);
    }
}