class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum = 0;
        int count = 0;
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(hm.containsKey(sum-k))
            {
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}