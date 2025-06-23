class Solution {
    public int maxProduct(int[] nums) {
        int maxPro = 1, minPro = 1, ans = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
             int temp = maxPro;
             maxPro = Math.max(temp*nums[i], Math.max(minPro*nums[i], nums[i]));
             minPro = Math.min(temp*nums[i], Math.min(minPro*nums[i], nums[i]));
             if(maxPro > ans) {
                ans = maxPro;
             }
        }
        return ans;
    }
}