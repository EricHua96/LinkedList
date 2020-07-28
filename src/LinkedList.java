
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
	
	public void addFirst(Object item)
	{
		Node newNode = new Node(item);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
			
		}
		
	}
	
	public void addLast(Object item)
	{
		Node newNode = new Node(item);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		
		if(head == tail)
		{
			
		}
		
	}
	

}
