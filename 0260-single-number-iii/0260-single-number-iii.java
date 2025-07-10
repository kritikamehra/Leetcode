class Solution {
    public int[] singleNumber(int[] nums) {
        long xor = 0;
        for(int i = 0; i < nums.length; i++) {
            xor = xor^nums[i];
        }
        long xorr = xor^(xor-1);
        xorr = xorr & xor;
        int b1 = 0, b2 = 0;
        for(int i = 0; i<nums.length; i++) {
            if((xorr & nums[i]) > 0) {
                b1 = b1^nums[i];
            }
            else b2 = b2^nums[i];
        }

        int[] ans = {b1, b2};
        return ans;
    }
}