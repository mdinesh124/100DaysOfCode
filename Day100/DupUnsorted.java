import java.util.*;

public class DupUnsorted
{
	static class node
	{
		int x;
		node next;

		public node(int x)
		{
			this.x = x;
		}
	}
	static void remove(node head)
	{
		HashSet<Integer> h = new HashSet<>();
		node current = head;
		node prev = null;
		while (current != null)
		{
			int curx = current.x;
			if (h.contains(curx)) {
				prev.next = current.next;
			} else {
				h.add(curx);
				prev = current;
			}
			current = current.next;
		}

	}
	static void printList(node head)
	{
		while (head != null)
		{
			System.out.print(head.x + " ");
			head = head.next;
		}
	}

	public static void main(String[] args)
	{
		node start = new node(7);
		start.next = new node(7);
		start.next.next = new node(8);
		start.next.next.next = new node(9);
		start.next.next.next.next = new node(8);
		start.next.next.next.next.next = new node(6);
		start.next.next.next.next.next.next = new node(6);
		remove(start);
		printList(start);
	}
}
