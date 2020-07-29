
public class LinkedList 
{

	public class Node<E>
	{
		
		Object data;
		Node<E> next;
		
		public Node(Object item)
		{
			this.data = item;
			this.next = null;
		}
		
	}
	
	Node head = null;
	Node tail = null;
	int nodeSize = 0;
	
	public void addFirst(Object item)
	{
		Node newNode = new Node(item);
		
		if(head == null)
		{
			head = newNode;
			tail = head;
			nodeSize++;
		}
		else
		{
			newNode.next = head;
			head = newNode;
			nodeSize++;
		}
		
	}
	
	public void addLast(Object item)
	{
		Node newNode = new Node(item);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			nodeSize++;
		}
		else
		{
			if(head == tail)
			{
			head.next = newNode;
			tail = head.next;
			nodeSize++;
			}
			else
			{
				tail.next = newNode;
				nodeSize++;
			}
		
		}
	}
	

}
