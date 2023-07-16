//https://practice.geeksforgeeks.org/problems/queue-reversal/1
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Queue<Integer> q1= new LinkedList<Integer>();
        Stack<Integer> s= new Stack<Integer>();
        while(q.isEmpty()==false){
            s.push(q.poll());
        }
        while(s.isEmpty()==false){
            q1.add(s.pop());
        }
        return q1;
    }
}
