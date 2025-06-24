class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        else if(nums[end-1] != nums[end]) return nums[end];
        while(end >= start) {
            int mid = start+(end-start)/2;
            
            if(mid%2 == 0) {
                if(mid-1 >= 0 && nums[mid] == nums[mid-1]) end = mid-1;
                else if(mid+1 < nums.length && nums[mid] == nums[mid+1]) start = mid+1;
                else return nums[mid];
            }

            else {
                if(mid-1 >= 0 && nums[mid] == nums[mid-1]) start = mid+1;
                else if(mid+1 < nums.length && nums[mid] == nums[mid+1]) end = mid-1;
                else return nums[mid];
            }
        }
        return nums[end];
    }
}