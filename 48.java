class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            int left=0,right=n-1;
            while(left<right)
            {
               int temp=arr[i][right];
               arr[i][right]=arr[i][left];
               arr[i][left]=temp; 
               left++;
               right--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        
        
    }
}