class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans = nums[0];
        while(l<=r)
        {
            if(nums[l] < nums[r])
            {
                return Math.min(nums[l],ans);
            }
            int mid = l+((r-l)/2);
            ans = Math.min(ans,nums[mid]);
            if(nums[l]<=nums[mid])
                l = mid + 1;
            else
                r = mid - 1;
            

        }
        return ans;
    }
}
