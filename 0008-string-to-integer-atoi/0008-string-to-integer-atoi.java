class Solution {
    public int myAtoi(String s) {
        
        String str = s.trim();
        boolean nonzero = false;
        long ans = 0;

        if(str.length() == 0) return 0;

        int sign = 1, i = 0;
        if(str.charAt(0) == '-' || str.charAt(0) == '+') {
            if(str.charAt(0) == '-') sign = -1;
            else sign = 1;
            i++;
        }
        for(; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') break;
            ans = ans*10 + (ch-'0');
            nonzero = true;
            if(sign*ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(sign*ans);
    }
}