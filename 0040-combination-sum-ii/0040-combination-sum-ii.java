class Solution {
    public void helper(int[] candidates, int target, Set<List<Integer>> ans, List<Integer> temp, int index) {
        
        if(target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            temp.add(candidates[i]);
            helper(candidates,target-candidates[i],ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, ans, temp, 0);
        List<List<Integer>> arr = new ArrayList<>(ans);
        return arr;
    }
}