class Solution {
    public void helper(int k, int n, int cnt, int sum, int num, List<List<Integer>> ans, List<Integer> temp) {
        if(cnt == k && sum == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(cnt > k || sum > n)  return;

        for(int i = num+1; i <= 9; i++) {
            temp.add(i);
            helper(k, n, cnt+1, sum+i, i, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(k, n, 0, 0, 0, ans, temp);
        return ans;
    }
}