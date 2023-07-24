\\https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
                Node t;
       ArrayList<Integer> res=new ArrayList <>();
       Queue<Node>q= new LinkedList<>();
       if(node==null)
       return res;
       q.add(node);
       while(!q.isEmpty())
       {
           int s=q.size();
           for(int i=1;i<=s;i++)
           {
              t=q.poll();
              if(i==s)
               res.add(t.data);
               if(t.left!=null)
               q.add(t.left);
               if(t.right!=null)
               q.add(t.right);
           }
       }
       return res;
    }
}
