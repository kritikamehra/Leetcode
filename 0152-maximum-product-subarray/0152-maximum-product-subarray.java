class Solution {
    public int maxProduct(int[] nums) {

        int ans = nums[0], maxPro = nums[0], minPro = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int temp = maxPro;
            maxPro = Math.max(Math.max(maxPro*nums[i], minPro*nums[i]), nums[i]);
            minPro = Math.min(Math.min(temp*nums[i],minPro*nums[i]), nums[i]);
            if(maxPro > ans)
                ans = maxPro;
        }

        return ans;
    }
}