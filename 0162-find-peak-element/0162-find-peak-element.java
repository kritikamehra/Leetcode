class Solution {
    public int findPeakElement(int[] nums) {
        int ans = -1;
        int n = nums.length;
        if(nums.length == 1)
            return 0;
        if(nums[0] > nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;
        int low = 1, high = n-2, mid;

        while(low <= high) {
            mid=low+(high-low)/2;

            // if(high-low <= 1) {
            //     if(nums[high]>=nums[low]) return high;
            //     else return low;
            // }

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if(nums[mid] < nums[mid-1])
                high = mid-1;
            else if(nums[mid] < nums[mid+1]) low = mid+1;
        }
        return 99;
    }
}