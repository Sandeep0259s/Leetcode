class Solution {
    public boolean searchMatrix(int[][] a, int target) {

        int m = a.length;
        int n = a[0].length;
        int l=0;
        int r=n*m-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            int i=mid/n;
            int j=mid%n;
            if(a[i][j]==target)
            {
                return true;
            }
            else if(a[i][j]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }

        return false;
    }
}