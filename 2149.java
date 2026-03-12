class Solution {
    public int[] rearrangeArray(int[] a) {
        int n=a.length;
        int[] b=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                b[pos]=a[i];
                pos+=2;
            }
            else
            {
                b[neg]=a[i];
                neg+=2;
            }
        }
        return b;
    }
}