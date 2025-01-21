class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        String rev = "";
        String[] arr = s.split(" ");
        for(int i = arr.length-1; i >= 0; i--) {
            rev+=arr[i].trim();
            if(i != 0 && arr[i].trim() != "")  rev+=" ";
        }

        return rev;
    }
}