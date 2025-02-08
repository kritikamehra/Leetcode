class Solution {
    public String reverse(String str) {
        if(str.length() == 0) return "";
        char ch = str.charAt(0);
        str = reverse(str.substring(1))+ch+"";
        return str;
    }
    public String reverseStr(String s, int k) {
        if(k == 1) return s;

        char arr[] = s.toCharArray();
        int n = s.length();
        for(int i = 0; i < n; i+=2*k) {
            int l = i, r = Math.min(i+k-1, n-1);
            while(l < r) {
                char t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}