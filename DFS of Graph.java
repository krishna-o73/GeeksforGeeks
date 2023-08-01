//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> al=new ArrayList<>();
        boolean[] visited=new boolean[V];
        f(0,visited,al,adj);
        return al;
        
        
    }
    public void f(int node, boolean[] visited,ArrayList<Integer> al,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        al.add(node);
        for(int i:adj.get(node)){
            if(visited[i]==false){
                f(i,visited,al,adj);
            }
        }
        
    }
}
