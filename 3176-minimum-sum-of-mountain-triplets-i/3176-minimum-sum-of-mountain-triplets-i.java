class Solution {
    public int minimumSum(int[] nums) {
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    if(nums[i] < nums[j] && nums[j] > nums[k]) {
                        sum = nums[i]+nums[j]+nums[k];
                        ans = Math.min(ans, sum);
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE? -1: ans;
    }
}