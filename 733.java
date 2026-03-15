class Solution {
    public void fill(int[][] a,int i,int j,int c,int oc)
    {
        int m=a.length;
        int n=a[0].length;
        if(i<0 || i>=m || j<0 || j>=n || a[i][j]!=oc)
        {
            return;
        }
        a[i][j]=c;
        fill(a,i-1,j,c,oc);
        fill(a,i+1,j,c,oc);
        fill(a,i,j-1,c,oc);
        fill(a,i,j+1,c,oc);
    }
    public int[][] floodFill(int[][] a, int sr, int sc, int color) {
        int x=a[sr][sc];
        if(x!=color)
        {
            fill(a,sr,sc,color,x);
        }
        return a;
    }
}