class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder s=new StringBuilder();
        int n1=w1.length();
        int n2=w2.length();
        int i=0;
        while(i<n1 || i<n2)
        {
            if(i<n1)
            {
                s.append(w1.charAt(i));
            }
            if(i<n2)
            {
                s.append(w2.charAt(i));
            }
            
            i++;
        }
        return s.toString();
    }
}
