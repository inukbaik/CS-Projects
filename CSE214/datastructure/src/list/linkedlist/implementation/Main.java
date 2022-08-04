package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		LinkedList.ListIterator li = numbers.listIterator();
		
		li.next();
		li.remove();
		
		System.out.println(numbers);
		
	}

}
