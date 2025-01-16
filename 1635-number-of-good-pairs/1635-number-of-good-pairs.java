class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            // for(int j = i+1; j < nums.length; j++) {
                // if(nums[i] == nums[j]) count++;
            // }
            if(mp.containsKey(nums[i])) {
                count += mp.get(nums[i]);
                mp.put(nums[i], mp.get(nums[i])+1);
            }
            else
                mp.put(nums[i], 1);
        }
        return count;
    }
}