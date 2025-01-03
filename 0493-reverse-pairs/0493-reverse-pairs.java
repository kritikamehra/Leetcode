class Solution {

    public void merge(int[] nums, int start, int mid, int end) {

        int count = 0, k = 0;
        int left = start, right = mid+1;
        int[] temp = new int[end-start+1];

        // Count reverse pairs
        // int left = start, right = mid + 1;
        // while (left <= mid) {
        //     while (right <= end && (long) nums[left] > 2L * nums[right]) {
        //         right++;
        //     }
        //     count += (right - mid - 1);
        //     left++;
        // }

        while(left <= mid && right <= end) {
            if(nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            }

            else {
                temp[k++] = nums[right++];
            }
        }

        while(left <= mid) {
            temp[k++] = nums[left++];
        }

        while(right <= end) {
            temp[k++] = nums[right++];
        }

        for(int i = 0; i < temp.length; i++) {
            nums[i+start] = temp[i];
        }
        // return count;
    }

    public int sort(int[] nums, int start, int end) {

        if(start >= end)
            return 0;

        int mid = (start+end)/2;
        int count = sort(nums, start, mid);
        count += sort(nums, mid+1, end);
        
        int left = start, right = mid + 1;
         while (left <= mid) {
            while (right <= end && (long) nums[left] > 2L * nums[right]) {
                right++;
            }
            count += (right - mid - 1);
            left++;
        }
        merge(nums, start, mid, end);

        return count;
    }
    public int reversePairs(int[] nums) {
        return sort(nums,0, nums.length-1);
    }
}