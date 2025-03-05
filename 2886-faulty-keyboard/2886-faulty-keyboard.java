class Solution {
    public String reverse(String str) {
        if(str.length() == 0)   return str;
        char[] arr = str.toCharArray();
        int i = 0, j = str.length()-1;
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }

        return new String(arr);
    } 
    public String finalString(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'i') {
                ans = reverse(ans);
            }
            else ans+=s.charAt(i);
        }
        return ans;
    }
}