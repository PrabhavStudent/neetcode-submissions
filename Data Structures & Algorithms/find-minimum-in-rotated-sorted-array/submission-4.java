class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int low = 0;
        int k = 0;
        while(low<n)
        {
            int mid = low + (n-low)/2;
            System.out.println(mid);
            if(nums[mid] > nums[n])
                low = mid +1;
            else
                n = mid;
             
        }
        return nums[low];
    }
}
