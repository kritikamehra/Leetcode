class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        if(s.length() == 1)
            return s;
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String str = s.substring(i,j+1);
                int a = 0, b = str.length()-1;
                while(a < b) {
                    if(str.charAt(a) == str.charAt(b)) {
                        a++;
                        b--;
                    }
                    else break;
                }
                if(a < b) continue;
                else {
                    if(j-i+1 > maxlen) {
                        maxlen = Math.max(maxlen,j-i+1);
                        ans = str;
                    }   
                }
            }
        }
        return ans;
    }
}