class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        if(s.length() == 0) return 0;
        s = s.trim();
        int sign = 1;
        int i = 0;
        if(s.length() >= 1 && (s.charAt(0) == '-' || s.charAt(0) == '+') ) {
            sign = s.charAt(0) == '-' ? -1 : 1;
            i++;
        }

        while(i < s.length() && s.charAt(i) == '0') {
            i++;
        }

        for(; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                break;
            else {
                int digit = s.charAt(i)-'0';

                //check if answer is not already overflowed
                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = ans*10 + digit;
            }
        }
        return ans*sign;
    }
}