class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum = nums[0], sum = nums[0];
        // int i = 0, j = i+1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]) {
                sum = nums[i];
            }
            else {
                sum+=nums[i];
            }
            
                maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }
}