class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        Set<List<Integer>> list = new HashSet<>();
        for(int i = 0 ; i < n; i++) {
            int start = i+1, end = n-1;
            while(start < end) {
                List<Integer> temp = new ArrayList<>();
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);

                    list.add(temp);
                    start++;
                    end--;
                    // temp.clear();
                }

                else if(sum < 0)
                    start++;

                else
                    end--;
            }
        }

        if(list != null)
        for(List<Integer> i: list) {
            ans.add(i);
        }

        return ans;
    }
}