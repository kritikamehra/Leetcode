class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";

        int i = 0, j = 0, n1 = word1.length(), n2 = word2.length();

        while(i < n1 && j < n2) {
            ans+=word1.charAt(i)+""+word2.charAt(j);
            i++;
            j++;
        }

        while(i < n1) {
            ans+=word1.charAt(i++);
        }

        while(j < n2) {
            ans+=word2.charAt(j++);
        }

        return ans;
    }
}