class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int l=0;
        int m=0;
        int h=n-1;
        while(m<=h)
        {
            if(a[m]==0)
            {
                int temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l++;
                m++;
            }
            else if(a[m]==1)
            {
                m++;
            }
            else if(a[m]==2)
            {
                int temp=a[h];
                a[h]=a[m];
                a[m]=temp;
                h--;
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
    }
}