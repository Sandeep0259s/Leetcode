class Solution {
    public boolean searchMatrix(int[][] a, int t) {

        int m = a.length;
        int n = a[0].length;

        int i = 0;
        int j=n-1;
        while(i<m && j>=0)
        {
            if(t==a[i][j])
            {
                return true;
            }
            else if(t<a[i][j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }

        return false;
    }
}