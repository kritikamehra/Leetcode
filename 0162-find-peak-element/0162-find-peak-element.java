class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1;

        if(nums.length == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[high] > nums[high-1]) return high;

        low = 1; 
        high = nums.length-2;
        while(low <= high) {
            int mid = low+(high-low)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid-1] > nums[mid]) high=mid-1;
            else if(nums[mid+1] > nums[mid]) low=mid+1;
        }
        return low;
    }
}