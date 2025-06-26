class Solution {
    public boolean isPossible(int nums[], int mid, int m, int k) {
        int flowers = 0, bouquet = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= mid) {
                flowers++;
                if(flowers == k) {
                    bouquet++;
                    flowers = 0;
                }
                if(bouquet == m) return true;
            }

            else flowers = 0;
        }
        return false;

    }
    public int minDays(int[] nums, int m, int k) {
        int maxBloomday = 0;
        int ans = -1;

        if(m*k > nums.length) return -1;

        for(int i = 0; i < nums.length; i++) {
            maxBloomday = Math.max(maxBloomday, nums[i]);
        }

        int start = 1, end = maxBloomday;

        while(start <= end) {
            int mid = start+(end-start)/2;

            if(isPossible(nums,mid,m,k)) {
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
}