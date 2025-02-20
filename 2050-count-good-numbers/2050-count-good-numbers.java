class Solution {
    public int countGoodNumbers(long n) {
        long o = n/2, e=n-o;
        long MOD = (int)1e9+7;
        long a = myPow(5,e, MOD);
        long b = myPow(4,o, MOD);
        return (int)((a*b)%MOD);
    }

    public long myPow(long x, long n, long MOD) {
        if(n == 0)  return 1;
        if(n == 1)  return x;

        if((n%2) == 0)    return (myPow((x*x)%MOD,n/2,MOD))%MOD;
    
        return (x*myPow(x,n-1,MOD))%MOD;
    }
}