class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, mid  = 0;

        while(mid <= high) {
            if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 2) {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }

            else {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
                }
            }
        }
    }
