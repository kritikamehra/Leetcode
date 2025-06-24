class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) 
            return 0;
        
        int start = 0, end = n-1;
        if(nums[0] > nums[1]) return 0;
        if(nums[end] > nums[end-1]) return end;

        while(end > start) {
            int mid = start + (end-start)/2;
            if(mid-1 >= 0 && mid+1 < n && nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(mid-1 >= 0 && nums[mid] > nums[mid-1]) start = mid;
            else end = mid;
        }

        return end;
    }
}