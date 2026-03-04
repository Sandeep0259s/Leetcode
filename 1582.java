class Solution {
    public int numSpecial(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int count=0;
        int s1[]=new int[m];
        int s2[]=new int[n];
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=a[i][j];
                s1[i]=sum;
            }
        }
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum+=a[j][i];
                s2[i]=sum;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1 && s1[i]==1 && s2[j]==1)
                {
                    count++;
                }
            }
        }

        
        return count;
    }
}