class Solution {
    public int findComplement(int n) {
        int x=0;
        int sum=0;
        if(n==0)
        {
            return 1;
        }
        while(n>0)
        {
            if((n & 1)==0)
            {
                sum+=Math.pow(2,x);
            }
            x++;
            n=n >> 1;   
        }
        return sum;
        
        
    }
}