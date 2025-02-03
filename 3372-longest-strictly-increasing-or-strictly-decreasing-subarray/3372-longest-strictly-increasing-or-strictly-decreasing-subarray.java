class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i = 0, j = i+1, n = nums.length, maxlen = 1;
        while(i < n && j < n) {
            if(nums[j] > nums[j-1]) {
                 j++;
                maxlen = Math.max(maxlen, j-i);
            }
            else {
                i=j;
                j++;
            }
        }
        i = 0;
        j = i+1;
        while(i < n && j < n) {
            if(nums[j] < nums[j-1]) {
                 j++;
                maxlen = Math.max(maxlen, j-i);
            }
            else {
                i=j;
                j++;
            }
        }
        return maxlen;
    }
}