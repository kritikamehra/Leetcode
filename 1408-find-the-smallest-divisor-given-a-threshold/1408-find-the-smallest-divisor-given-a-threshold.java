class Solution {
    public boolean isPossible(int[] nums, int mid, int threshold) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count+=Math.ceil((double)nums[i]/(double)mid);
            if(count > threshold) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE, ans = -1;
        for(int i = 0; i < nums.length; i++) 
            high = Math.max(high,nums[i]);

        while(low <= high) {
            int mid = low+(high-low)/2;
            boolean check = isPossible(nums,mid,threshold);
            if(check) {
                ans = mid;
                high=mid-1;
            }

            else low=mid+1;
                
        }
        return ans;
    }
}