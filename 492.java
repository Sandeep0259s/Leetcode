class Solution {
    public int[] constructRectangle(int n) {

        int[] a= new int[2];

        for(int i = (int)Math.sqrt(n); i >= 1; i--)
        {
            if(n % i == 0)
            {
                a[0] = n / i; 
                a[1] = i;  
                break;
            }
        }

        return a;
    }
}