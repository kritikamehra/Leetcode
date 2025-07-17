class Solution {
    public int helper(int m, int n) {
        int prev[] = new int[n];
        Arrays.fill(prev, 1);

        for(int i = 1; i < m; i++) { 
            for(int j = 1; j < n; j++) {
                prev[j] += prev[j-1];
            }
        }
        return prev[n-1];
    }
    public int uniquePaths(int m, int n) {
        return helper(m, n);
    }
}