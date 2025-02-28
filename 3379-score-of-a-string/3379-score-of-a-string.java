class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i < s.length()-1; i++) {
            int diff = s.charAt(i)-s.charAt(i+1);
            sum+=Math.abs(diff);
        }
        return sum;
    }
}