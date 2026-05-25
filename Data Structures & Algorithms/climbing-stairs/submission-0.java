class Solution {
    public int climbStairs(int n) {
       int dp[] = new int[n+1];
       Arrays.fill(dp,-1);
        int res = result(n,dp);
        return res;
    }
    private int result(int n, int dp[])
    { 
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        if(dp[n]!= -1)
            return dp[n];
        
        int res = result(n-1, dp) + result(n-2, dp);
        
        return dp[n] = res;
    }
}