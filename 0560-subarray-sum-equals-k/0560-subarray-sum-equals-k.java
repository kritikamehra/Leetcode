class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum == k) count++;
            int rem = sum-k;
            if(mp.containsKey(rem)) {
                count += mp.get(rem);
                // mp.put(rem, mp.getOrDefault(sum, 0)+1);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}