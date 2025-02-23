class Solution {
    public void calc(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int index) {

        if(index == candidates.length || target < 0) {
            if(target == 0) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        //not pick
        calc(ans, temp, candidates, target, index+1);

        //pick
        temp.add(candidates[index]);
        calc(ans, temp, candidates, target-candidates[index], index);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        calc(ans, temp, candidates, target, 0);
        return ans;
    }
}