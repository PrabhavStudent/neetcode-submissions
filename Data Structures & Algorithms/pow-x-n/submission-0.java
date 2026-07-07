class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        if(n<0)
        {
            x = 1/x;
            n = -1*n;
        }
        while(n!=0)
        {
            res = res * x;
            n--; 
        }
        return res;
    }
}
