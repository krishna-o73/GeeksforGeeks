//https://practice.geeksforgeeks.org/problems/inorder-successor-in-bst/1
class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public Node inorderSuccessor(Node root,Node x)
         {
           ArrayList<Node> ar = new ArrayList<>();
           inorder(root, ar);
           int count = 0;
           for(int i = 0 ; i < ar.size() ; i ++){
               if(ar.get(i) == x && i != ar.size()-1) return ar.get(i+1);
           }
           return null;
         }
         static void inorder(Node root, ArrayList<Node> ar){
             if(root == null) return;
             inorder(root.left, ar);
             ar.add(root);
             inorder(root.right, ar);
         }
}
