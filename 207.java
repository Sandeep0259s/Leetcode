class Solution {
    public boolean canFinish(int V, int[][] E) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        Queue<Integer> q=new LinkedList<>();
        int in[]=new int[V];
        for(int i=0;i<E.length;i++)
        {
            int v=E[i][0];
            int u=E[i][1];
            adj.get(u).add(v);
        }
        int count=0;
        for(int i=0;i<V;i++)
        {
            for(int next:adj.get(i))
            {
                in[next]++;
            }
        }
        for(int i=0;i<V;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int top=q.poll();
            count++;   
            for(int i:adj.get(top))
            {
                in[i]--;
                if(in[i]==0)
                {
                    q.add(i);
                }
            }
        }
        return count==V;
        
    }
}