class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int money1 = funRob(nums, 0, n - 2);
        int money2 = funRob(nums, 1, n - 1);

        return Math.max(money1, money2);
    }

    private int funRob(int[] nums, int s, int e) {
        int prevRob1 = 0;
        int prevRob2 = 0;

        for (int i = s; i <= e; i++) {
            int curr = Math.max(prevRob1, prevRob2 + nums[i]);
            prevRob2 = prevRob1;
            prevRob1 = curr;
        }
        return prevRob1;
    }
}