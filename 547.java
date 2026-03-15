class Solution {
    public void prov(int[][] a,boolean[] v,int b)
    {
        int n=a.length;
        int i=b;
        int j=0;
        v[b]=true;
        while(j<n)
        {
            if(!v[j] && a[i][j]==1)
            {
                v[j]=true;
                prov(a,v,j);
            }
            j++;
        }

    }
    public int findCircleNum(int[][] a) {
        int n=a.length;
        boolean v[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!v[i])
            {
                count++;
                prov(a,v,i);
            }
        }
        return count;
        
    }
}