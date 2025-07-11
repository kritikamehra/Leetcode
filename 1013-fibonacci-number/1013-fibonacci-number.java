class Solution {
    public int helper(int n) {
        if(n <= 1) return n;

        // int[] dp = new int[n+1];
        int first = 0;
        int second = 1;
        int third = first+second;

        for(int i = 2; i <= n; i++) {
            third = first+second;
            first = second;
            second = third;
        }

        return third;
    }
    public int fib(int n) {
        return helper(n);
     }
}