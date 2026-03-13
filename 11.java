class Solution {
    public int maxArea(int[] a) {
        int area=0;
        int water;
        int n=a.length;
        int j=n-1;
        int i=0;
        while(i<j)
        {   
            water=(j-i)*(Math.min(a[i],a[j]));
            area=Math.max(area,water);
            if(a[i]<a[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return area;
        
    }
}