class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int start = j+1, end = n-1;

                while(start < end) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end];

                    if(sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        // Collections.sort(temp);
                        res.add(temp);
                        start++;
                        end--;
                    }

                    else if(sum < target)
                        start++;

                    else
                        end--;
                } 
            }
        }

        List<List<Integer>> ans = new ArrayList<>(res);
        
        return ans;
    }
}