class Solution {
    public int maximumCount(int[] nums) {
        int negcount = 0, poscount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) negcount++;
            if(nums[i] > 0) poscount++;
        }   

        return Math.max(negcount, poscount);
    }
}