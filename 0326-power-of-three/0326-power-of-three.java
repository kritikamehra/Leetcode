class Solution {
    public boolean isPowerOfThree(int n) {
        double num= (double)n;
        if(n==1)    return true;
        if(n==3)    return true;
        while(num > 0) {
            num = num/3;
            if(num == 3.0)  break;
        }
        if(num==3) return true;
        return false;
    }
}