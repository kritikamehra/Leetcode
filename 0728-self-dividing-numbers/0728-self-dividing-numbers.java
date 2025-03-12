class Solution {
    public boolean helper(int num) {
        int n = num;
        while(n > 0) {
            int rem = n%10;
            if(rem == 0 || (num%rem) != 0) return false;
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for(int i = left; i <= right; i++) {
            boolean check = helper(i);
            if(check) ans.add(i);
        }

        return ans;
    }
}