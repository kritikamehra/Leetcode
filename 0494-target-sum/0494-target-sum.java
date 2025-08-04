class Solution {
    public int helper(int[] nums, int target, int index) {
        
        if(index == 0){
            if(target == 0 && nums[0] == 0) return 2;
            else if(target == 0 || target == nums[0]) return 1;
            else return 0;   
        }

        int pick = 0;
        if(nums[index] <= target) pick = helper(nums, target-nums[index], index-1);
        int notpick = helper(nums, target, index-1);

        return pick+notpick;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        if(sum-target < 0) return 0;
        if((sum-target)%2 == 1) return 0;

        int s = (sum-target)/2;

        return helper(nums, s, nums.length-1);
    }
}