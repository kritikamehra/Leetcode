class Solution {
    public double myPow(double x, int n) {
        if(n < 0) {
            if(n == Integer.MIN_VALUE)
                return 1/x * myPow(1/x,Integer.MAX_VALUE);
                //as intmax ends in 7 and int min ends in 8 so we are multipling extra 1/x
            else
                return myPow(1/x,-n);
        }
        if(n == 0)  return 1.0;

        if(n%2 == 0) {
            double temp = myPow(x,n/2);
            return temp*temp;
        }
        else
            return x*myPow(x,n-1);
    }
}