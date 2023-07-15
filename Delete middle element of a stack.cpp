//https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
class Solution
{
    public:
    //Function to delete middle element of a stack.
    void rec(stack<int>&s,int ind,int mid){
        if(ind==mid){//Base condition
            s.pop(); //pop middle one
            return;
        }
        int temp=s.top();
        s.pop();
        rec(s,ind+1,mid);//call the recursion
        s.push(temp);//push all the elements again to the stack
    }
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        // code here.. 
        int mid=sizeOfStack/2;//top n/2 elements are to be to pushed again
        rec(s,0,mid);
    }
};
