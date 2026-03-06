class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        boolean bool=true;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)=='0' &&s.charAt(i+1)=='1')
            {
                bool=false;
            }
        }
        return bool;
        
    }
}