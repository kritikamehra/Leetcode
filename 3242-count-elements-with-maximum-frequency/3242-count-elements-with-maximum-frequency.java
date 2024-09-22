class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(mp.containsKey(nums[i])) {
                int v = mp.get(nums[i]);
                v++;
                mp.put(nums[i], v);
            }

            else {
                mp.put(nums[i], 1);
            }
        }

        
        int max_val = 1;

        for(int i: mp.keySet()) {
            if(mp.get(i) > max_val)
                max_val = mp.get(i);
        }

        int count = 0;

        for(int i: mp.keySet()) {
            if(mp.get(i) == max_val)
                count+=mp.get(i);
        }

        return count;
    }
}