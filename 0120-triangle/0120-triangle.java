class Solution {
    public int helper(List<List<Integer>> triangle) {
        int m = triangle.size();
        int prev[] = new int[m];

        for(int i = m-1; i >= 0; i--) {
            prev[i] = triangle.get(m-1).get(i);
        }
        
        for(int i = m-2; i >= 0; i--) {
            int[] temp = new int[m];
            for(int j = i; j >= 0; j--) {
                int down = prev[j];
                int right = prev[j+1];
                temp[j] = triangle.get(i).get(j) + Math.min(down, right);
            }
            prev = temp;
        }


        return prev[0];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle);
    }
}