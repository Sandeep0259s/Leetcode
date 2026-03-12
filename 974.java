class Solution {
    public int subarraysDivByK(int[] a, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=a.length;
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            int rem=(sum%k + k)%k;
            if(map.containsKey(rem))
            {
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }        
        return count;
    }
}