class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'M':
                    sum+=1000;
                    break;
                case 'D':
                    if(i != s.length()-1 && (s.charAt(i+1) == 'D'))
                        sum-=500;
                    else
                        sum+=500;
                    break;
                case 'C':
                    if(i != s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        sum-=100;
                    else
                        sum+=100;
                    break;
                case 'L':
                    if(i != s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M' || s.charAt(i+1) == 'C'))
                        sum-=50;
                    else
                        sum+=50;
                    break;
                case 'X':
                    if(i != s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M' || s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L'))
                        sum-=10;
                    else
                        sum+=10;
                    break;
                case 'V':
                    if(i != s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M' || s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L' || s.charAt(i+1) == 'X'))
                        sum-=5;
                    else
                        sum+=5;
                    break;
                case 'I':
                    if(i != s.length()-1 && s.charAt(i+1) != 'I')
                        sum-=1;
                    else
                        sum+=1;
                    break;
            }
        }
        return sum;
    }
}