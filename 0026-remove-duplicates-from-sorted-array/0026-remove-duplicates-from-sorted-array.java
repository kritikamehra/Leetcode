class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n == 1)
            return 1;

        int i = 1, k = nums[0];

        for(int j = 1; j < n; j++) {
            if(k == nums[j]) {
                continue;
            }
            else {
                k = nums[j];
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}