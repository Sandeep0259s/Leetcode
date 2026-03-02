class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++)
        {
            char pos0=(i%2==0) ? '0' : '1';
            char pos1=(i%2==0) ? '1' : '0';
            if(s.charAt(i)!=pos0)
            {
                c1++;
            }
            if(s.charAt(i)!=pos1)
            {
                c2++;
            }
           
        }
        return Math.min(c1,c2);
    }
}