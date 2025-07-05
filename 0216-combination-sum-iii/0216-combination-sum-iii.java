class Solution {

    public void helper(List<List<Integer>> ans, List<Integer> temp, int index, int k, int n, int digit, int sum) {
        if(n < k) return;

        if(index == k && n == sum) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = digit+1; i <= 9; i++) {
            temp.add(i);
            helper(ans, temp, index+1, k, n, i, sum+i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans, temp, 0, k, n, 0, 0);
        return ans;
    }
}