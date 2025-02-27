class Solution {
    public void helper(int k, int n, int num, List<List<Integer>> ans, List<Integer> temp) {
        if(temp.size() == k && n == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(temp.size() > k || n < 0)  return;

        for(int i = num; i <= 9; i++) {
            temp.add(i);
            helper(k, n-i, i+1, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(k, n, 1, ans, temp);
        return ans;
    }
}