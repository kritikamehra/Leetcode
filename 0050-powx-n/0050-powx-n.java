class Solution {
    public double pow(double x, double p) {
        if(p == 0) return 1;
        if(p == 1)  return x;
        if(p%2 == 0) {
            double temp = pow(x,p/2);
            return temp*temp;
        }
        else {
            return x*pow(x,p-1);
        }
    }
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1)  return x;
        if(x == 1)  return 1;
        double p = (double)n;
        // int p = n;
        if(n < 0)
            return pow(1/x, (-p));
        else
            return pow(x, p);
    }
}