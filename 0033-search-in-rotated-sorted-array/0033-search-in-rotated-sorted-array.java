class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low <= high) {
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[high] >= nums[mid]) {
                if(target <= nums[high] && target >= nums[mid]) low = mid + 1;
                else high = mid-1;
                // if(target > nums[low]) low = mid+1;
                // else high = mid-1;
            }
            else {
                // if(target < nums[high]) high = mid-1;
                if(target >= nums[low] && target <= nums[mid]) high = mid-1;
                else low=mid+1;
                // if(target <= nums[low] && nums[mid] < nums[low]) high = mid-1;
                // else low = mid+1;
            }
        }
        return -1;
    }
}