class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int top=0;
        int bot=n-1;
        int l=0;
        int r=m-1;
        while(l<=r && top<=bot)
        {
            for(int i=l;i<=r;i++)
            {
                a.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++)
            {
                a.add(mat[i][r]);
            }
            r--;
            if(top<=bot)
            {
                for(int i=r;i>=l;i--)
                {
                    a.add(mat[bot][i]);
                }
                bot--;
            }
            if(l<=r)
            {
                for(int i=bot;i>=top;i--)
                {
                    a.add(mat[i][l]);
                }
                l++;
            }
           
        }
        return a;
        
    }
}