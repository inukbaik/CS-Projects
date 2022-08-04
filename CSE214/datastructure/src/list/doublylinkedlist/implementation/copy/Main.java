package list.doublylinkedlist.implementation.copy;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList numbers = new DoublyLinkedList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		DoublyLinkedList.ListIterator li = numbers.listIterator();
		
		li.next();
		li.remove();
		
		System.out.println(numbers);
		
	}

}
