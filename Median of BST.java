//https://practice.geeksforgeeks.org/problems/median-of-bst/1
class Tree
{
    public static void fun(Node root,ArrayList<Integer>a1){
        if(root==null)return ;
        fun(root.left,a1);
        a1.add(root.data);
        fun(root.right,a1);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> a1= new ArrayList<>();
        fun(root,a1);
        int n=a1.size();
        float k;
        if(n%2!=0){
            return a1.get(n/2);
        }
    return ((float)a1.get((n/2)-1)+a1.get(n/2))/2;
        
    }
}
