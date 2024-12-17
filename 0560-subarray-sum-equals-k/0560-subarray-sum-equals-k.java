class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int count = 0;
        int maxlen = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == k){
                count++;
                // maxlen = Math.max(i+1,maxlen);
                // return maxlen;
            }
                
            int rem = sum-k;
            if(mp.containsKey(rem))
                // count++;
                count += mp.get(rem);
                // maxlen = Math.max(i-mp.get(rem),maxlen);
            
            // if(!mp.containsKey(sum))
                // mp.put(sum,i);
            // mp.put(sum,mp.getOrDefault(sum,0)++);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
        // return maxlen;
    }
}