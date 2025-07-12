class Solution {
    public int helper(int n) {
        
        if(n <= 1) return 1;
        int onestep = 1, twostep = 1, nextstep = onestep+twostep;

        for(int i = 2; i <= n; i++) {
            nextstep = onestep+twostep;
            twostep = onestep;
            onestep = nextstep;
        }

        return nextstep;
    }
    public int climbStairs(int n) {
        return helper(n);
    }
}