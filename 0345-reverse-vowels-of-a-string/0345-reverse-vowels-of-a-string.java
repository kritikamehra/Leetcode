class Solution {
    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }

        return false;
    }
    public String reverseVowels(String str) {
        char arr[] = str.toCharArray();

        int s = 0, e = arr.length-1;

        while(s < e) {
            boolean sv =isVowel(arr[s]);
            boolean ev = isVowel(arr[e]);
            if(sv && ev) {
                char ch = arr[s];
                arr[s] = arr[e];
                arr[e] = ch;
                s++;
                e--;
            }

            else if(sv && !ev) {
                e--;
            }

            else {
                s++;
            }
        }

        String ans = "";
        for(int i = 0 ; i < arr.length; i++) {
            ans+=arr[i]+"";
        }
        return ans;
    }
}