//https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1
class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
        SortedSet<Integer> set = new TreeSet<>();
        Node c = head1;
        while (c != null) {
            set.add(c.data);
            c = c.next;
        }

        Node d = head2;
        while (d != null) {
            set.add(d.data);
            d = d.next;
        }
        Node Head = new Node(0);
        Node t = Head;

        for (int num : set) {
            t.next = new Node(num);
            t = t.next;
        }
        return Head.next;
	}
}
