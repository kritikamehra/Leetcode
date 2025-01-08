class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            if((mid)%2 == 0) {
                if(mid-1 >= 0 && nums[mid-1] == nums[mid]) high = mid-1;
                else if(mid+1 <= nums.length-1 && nums[mid+1] == nums[mid]) low=mid+1;
                else return nums[mid];
            }
            else {
                if(mid+1 <= nums.length-1 && nums[mid+1] == nums[mid]) high = mid-1;
                else if (mid-1 >= 0 && nums[mid-1] == nums[mid]) low=mid+1;
                else return nums[mid];
            }
            // else if((mid+1)%2 == 0 && mid+1 <= nums.length-1 && nums[mid] == nums[mid+1]) high = mid-1;
            // else return nums[mid];
        }
        return nums[low];
    }
}