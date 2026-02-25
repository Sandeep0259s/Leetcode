class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(a[i]!=a[j])
            {
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
}
}