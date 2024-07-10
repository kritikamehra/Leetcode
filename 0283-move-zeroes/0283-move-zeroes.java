class Solution {
    public void moveZeroes(int[] nums) {
        int i = -1, n = nums.length;

        for(int k = 0; k < n; k++) {
            if(nums[k] == 0){
                i = k;
                break;
            }
        }

        if(i == -1)
            return;

        for(int k = i+1; k < n; k++) {
            if(nums[k] != 0) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}