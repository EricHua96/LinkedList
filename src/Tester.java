import java.awt.List;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList testlist = new LinkedList();
		
		
		testlist.addFirst(1);
		testlist.addFirst(2);
		testlist.addFirst(3);
		testlist.addFirst(4);
		
		
		
		testlist.addLast(5);
		testlist.addLast(6);
		testlist.addLast(7);
		testlist.addLast(9);
		
		
		
		testlist.removeLast(); // remove 9 and tail should be 7
		testlist.removeFirst(); // remove 4 and head should be 3
		
		
		testlist.printList();
		
		
		System.out.println("Size of List: " + testlist.getListSize());
		System.out.println("Head:" + testlist.peekFirst());
		System.out.println("Tail:" + testlist.peekLast());
		
	}

}
