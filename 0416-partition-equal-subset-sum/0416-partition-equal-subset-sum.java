class Solution {
    public boolean helper(int[] nums, int target) {

        boolean[] prev = new boolean[target+1];
        Arrays.fill(prev, false);
        for(int i = 0; i <= target; i++) {
            prev[i] = (nums[0] == i);
        }
        prev[0] = true;

        for(int i = 1; i < nums.length; i++) {
            boolean temp[] = new boolean[target+1];
            temp[0] = true;
            for(int j = 1; j <= target; j++) {
                boolean nottake = prev[j];
                boolean take = false;
                if(nums[i] <= j)
                    take = prev[j-nums[i]];

                temp[j] = take || nottake;
            }
            prev = temp;
        }
        return prev[target];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum%2 == 1) return false;
        sum = sum/2;
        
        return helper(nums, sum);
    }
}