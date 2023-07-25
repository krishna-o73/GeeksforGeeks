//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
class Spiral
{
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();
    ArrayList<Integer> findSpiral(Node root) {
        
        st1.add(root);
        while(!st1.isEmpty() || !st2.isEmpty()){
              while(!st1.isEmpty()){
                  Node curnode = st1.pop();
                  list.add(curnode.data);
                  RightToleft(curnode);
              }
              while(!st2.isEmpty()){
                  Node curnode = st2.pop();
                  list.add(curnode.data);
                  leftToRight(curnode);
              }
        }
        return list;
    }
    void leftToRight(Node curnode){
        if(curnode.left!=null){
             st1.add(curnode.left);
        }
        if(curnode.right!=null){
            st1.add(curnode.right);
        }
    }
    
    void RightToleft(Node curnode){
        if(curnode.right!=null){
            st2.add(curnode.right);
        }
        if(curnode.left!=null){
             st2.add(curnode.left);
        }
    }
}
