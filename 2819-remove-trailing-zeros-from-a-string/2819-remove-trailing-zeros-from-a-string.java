class Solution {
    public String removeTrailingZeros(String num) {
        int index = num.length()-1;
        while(index >= 0) {
            if((num.charAt(index)-'0') != 0) break;
            else index--;
        }
        return num.substring(0,index+1);
    }
}