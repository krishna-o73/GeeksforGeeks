//https://practice.geeksforgeeks.org/problems/maximum-depth-of-binary-tree/1
class Solution {
    public static int dfs(Node root){
        if(root == null) return 0;
        return Math.max(dfs(root.left),dfs(root.right))+1;
    }
  public static int maxDepth(Node root) {
      return dfs(root);

  }
}
