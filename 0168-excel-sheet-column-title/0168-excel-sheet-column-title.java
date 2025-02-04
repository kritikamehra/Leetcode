class Solution {
    public String convertToTitle(int columnNumber) {
        columnNumber--;
        if(columnNumber < 26)
            return (char)(columnNumber+'A')+"";
        String ans = "";
        String temp = convertToTitle(columnNumber/26);
        char ch = (char)((columnNumber%26)+'A');
        ans = temp + ch;
        System.out.print(columnNumber%26);
        return ans;
    }
}