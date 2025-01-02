class Solution {

    public boolean check(String str, int start, int end) {
        if(start >= end)
            return true;
        
        
            if(str.charAt(start) != str.charAt(end))
                return false;
    
            return check(str, start+1, end-1);
    
    }
    public boolean isPalindrome(String s) {
        String str = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
                continue;
            }

            else {
                str = str + ch +"";
            }
        }
        str = str.toLowerCase();
// System.out.println(str);
// return true;
        boolean ans = check(str, 0, str.length()-1);
        return ans;
    }
}