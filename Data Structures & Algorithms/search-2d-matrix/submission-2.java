class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int s = 0;
        int e = m-1;
        while(s<=e)
        {
            int mid = s+((e-s)/2);
            if(target >=matrix[mid][0] && target<=matrix[mid][n-1])
            {
                return binarysearch(matrix,target,mid);
            }
            else if(target >= matrix[mid][n-1])
                s = mid +1;
            else
                e = mid - 1;

        }
        return false;
    }
    private boolean binarysearch(int[][]mat,int target,int mid)
    {
        int n = mat[0].length;
        int s = 0;
        int e = n-1;
        while(s<=e)
        {
            int m = s+((e-s)/2);
            if(mat[mid][m] == target)
                return true;
            else if(mat[mid][m] > target)
                e = m-1;
            else
                s = m+1;
        }
    return false;
    }
}
