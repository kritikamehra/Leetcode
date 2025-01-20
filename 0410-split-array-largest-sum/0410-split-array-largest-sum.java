class Solution {

    public boolean isPossible(int[] nums, int k, int mid) {
        int count = 1, sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum > mid) {
                sum = nums[i];
                count++;
            }
            if(count > k)   return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(n < k)   return -1;

        int low = Integer.MIN_VALUE, high = 0, ans = -1;
        for(int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low <= high) {
            int mid = low+(high-low)/2;
            boolean check = isPossible(nums, k, mid);
            if(check) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        return ans;
    }
}