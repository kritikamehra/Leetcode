class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int longest = 0;

        for(int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }

        for(int i : s) {
            if(!s.contains(i-1)) {
                int x = i+1;
                int count = 1;
                while(s.contains(x)) {
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}