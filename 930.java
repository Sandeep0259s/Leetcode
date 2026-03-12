class Solution {
    public int numSubarraysWithSum(int[] a, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=a.length;
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(map.containsKey(sum-goal))
            {
                count+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}