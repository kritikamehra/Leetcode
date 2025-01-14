class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0, start = 0;
        while(i < haystack.length() && j < needle.length()) {
            if(haystack.charAt(i) == (needle.charAt(j))) {
                i++;
                j++;
            }

            else{
                start++;
                i = start;
                j = 0;
            }
        }

        if(j == needle.length()) return i-needle.length();

        return -1;
    }
}