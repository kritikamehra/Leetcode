class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if(strs[i].length() < ans.length())
                ans = ans.substring(0,strs[i].length());
            
            for(int j = 0; j < ans.length(); j++) {
                if(strs[i].charAt(j) != ans.charAt(j)) {
                    ans = ans.substring(0, j);
                    break;
                }
            }

            if(ans.length() == 0)   return ans;
        }

        return ans;
    }
}