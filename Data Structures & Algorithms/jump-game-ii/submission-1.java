class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int j=0;
        int n = nums.length;
        while(r<n-1)
        {
            int farthest = 0;
            for(int i=0;i<=r;i++)
            {
                farthest = Math.max(farthest,i+nums[i]);
            }
            l = r+1;
            r = farthest;
            j++;
        }
        return j;
    }
}
