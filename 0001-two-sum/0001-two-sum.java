class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<arr.length; i++) {
            int rem = target - arr[i];
            if(!hm.containsKey(rem))
                hm.put(arr[i],i);
            else {
                ans[0] = hm.get(rem);
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}