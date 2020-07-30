
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
	Node prev = null;
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
				prev = head;
				tail = head.next;
				nodeSize++;
			}
			else
			{
				tail.next = newNode;
				prev = tail;
				tail = tail.next;
				nodeSize++;
			}
		}
	}
	
	public void removeFirst()
	{
		if(head == null)
			{
				throw new NullPointerException("Node does not exist");
			}
		
		if(head.next == null)
			{
				head = null;
				tail = null;
				nodeSize--;
			}
		else 
			{
				head = head.next;
				nodeSize--;
			}
	}
	
	
	public void removeLast()
	{
			if(head == null || head == tail)
			{
				removeFirst();
			}
			else
			{
				tail = prev;
				nodeSize--;
			}
	
	}
	
	public Object peekFirst()
	{
		if(head == null)
		{
			throw new NullPointerException("Node does not exist");
		}
		
		return head.data;
	}
	
	public Object peekLast()
	{
		if(nodeSize <= 1 )
		{
			peekFirst();
		}
		
		return tail.data;
	}
	
	public int getSize()
	{
		return nodeSize;
	}
	
	
}
