class Solution {
    public int[] constructRectangle(int n) {

        int[] ans = new int[2];

        for(int i = (int)Math.sqrt(n); i >= 1; i--)
        {
            if(n % i == 0)
            {
                ans[0] = n / i; 
                ans[1] = i;  
                break;
            }
        }

        return ans;
    }
}