class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int l = 0;
        long total_sum = 0;
        int maxfreq = 0;


        for(int r = 0; r < nums.length; r++) {
            // len = r - l + 1;
            total_sum += nums[r];
            while( l+1 <= r && (long)nums[r] * (r - l + 1) > total_sum + k) {
                total_sum -=nums[l++];
            }

            maxfreq = Math.max(maxfreq, r - l + 1);
        }

        return maxfreq;
    }
}