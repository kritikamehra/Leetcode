class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0, arr_xor = 0;

        for(int i = 0; i <= nums.length; i++) {
            xor = xor^i;
        }

        for(int i = 0; i < nums.length; i++) {
            arr_xor = arr_xor^nums[i];
        }

        return xor^arr_xor;
    }
}