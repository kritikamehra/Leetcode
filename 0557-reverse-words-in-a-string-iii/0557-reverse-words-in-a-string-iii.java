class Solution {
    public String reverseWords(String s) {
        String temp = "", ans ="";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                temp = s.charAt(i)+temp;
            }
            else {
                ans = ans+" "+temp;
                temp = "";
            }
        }

        ans = ans+" "+temp;
        return ans.trim();
    }
}