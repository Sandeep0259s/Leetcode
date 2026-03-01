class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=p.length();
        int m=s.length();
        if(n>m)
        {
            return arr;
        }
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++)
        {
            char c1=p.charAt(i);
            char c2=s.charAt(i);
            a[c1-'a']++;
            b[c2-'a']++;
        }
        if(Arrays.equals(a,b))
        {
            arr.add(0);
        }
        for(int i=n;i<m;i++)
        {
            char c=s.charAt(i);
            b[c-'a']++;
            b[s.charAt(i-n)-'a']--;
            if(Arrays.equals(a,b))
            {
                arr.add(i-n+1);
            }
        }
        return arr;
    }
}