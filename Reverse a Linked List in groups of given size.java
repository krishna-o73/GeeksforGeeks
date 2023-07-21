//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        
        Node curr=node;
        Node ghead=null;
        Node tail=null;
        
        while(curr!=null){
            
            Node currr=curr;
            Node prev=null;
            Node nex=node;
            int count=0;
            
            while(nex!=null && count<k){
                nex=currr.next;
                currr.next=prev;
                prev=currr;
                currr=nex;
                count++;
            }

            if(ghead==null) ghead=prev;
            else tail.next=prev;
            
            tail=curr;
            curr=currr;

        }

        return ghead;
        
        
    }
}
