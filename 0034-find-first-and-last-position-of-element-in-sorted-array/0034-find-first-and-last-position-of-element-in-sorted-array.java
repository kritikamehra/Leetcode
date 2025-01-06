class Solution {
    public int lastpos(int[] nums, int target) {
        int low = 0, high = nums.length-1, mid, ans = -1;
        while(low <= high) {
            mid=low+(high-low)/2;
            if(nums[mid] == target) {
                ans = mid;
                low=mid+1;
            }
            else if(nums[mid] > target) {
                high = mid-1;
            }
            else  low=mid+1;
        }
        return ans;
    }

    public int firstpos(int[] nums, int target) {
        int low = 0, high = nums.length-1, mid, ans = -1;
        while(low <= high) {
            mid=low+(high-low)/2;
            if(nums[mid] == target) {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] > target) {
                high = mid-1;
            }
            else  low=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = firstpos(nums,target);
        ans[1] = lastpos(nums, target);
        return ans;
    }
}