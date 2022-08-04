package list.linkedlist.implementation;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{
		private Object data;
		private Node next;
		private Node prev;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
			this.prev = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		
		if(head != null) {
			head.prev = newNode;
		}
		
		head = newNode;
		size++;
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			size++;
		}
	}
	
	Node node(int index) {
		if(index < size / 2) {
			Node x = head;
			for(int i = 0; i < index; i++) {
				x = x.next;
			}
			return x;
		}else {
			Node x = tail;
			for(int i = size - 1; i > index; i--) {
				x = x.prev;
			}
			return x;
		}
	}
	
	public void add(int index, Object input) {
		if(index == 0) {
			addFirst(input);
		}else {
			Node temp1 = node(index - 1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			if(temp2 != null) {
				temp2.prev = newNode;
			}
			newNode.prev = temp1;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public Object removeFirst() {
		Node temp = head;
		head = temp.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	public Object remove(int index) {
		if(index == 0) {
			return removeFirst();
		}else {
			Node temp = node(index - 1);
			Node tobeDeleted = node(index);
			Object returnData = tobeDeleted.data;
			temp.next = temp.next.next;
			if(tobeDeleted == tail) {
				tail = temp;
			}
			tobeDeleted = null;
			size--;
			return returnData;
		}
	}
	
	public Object removeLast() {
		return remove(size - 1);
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) {
		Node temp = node(index);
		return temp.data;
	}
	
	public int indexOf(Object o) {
		Node temp = head;
		int index = 0;
		while(temp.data != o) {
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	class ListIterator {
		private Node next;
		private Node lastReturned;
		private int nextIndex = 0;
		
		ListIterator() {
			next = head;
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned;
		}
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public void add(Object input) {
			Node newNode = new Node(input);
			if(lastReturned == null) {
				head = newNode;
				newNode.next = next;
			}else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		public void remove() {
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			LinkedList.this.remove(nextIndex - 1);
			nextIndex--;
		}
	}
	
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		while(temp != null) {
			str += temp.data;
			if(temp.next != null) {
				str += ",";
			}
			temp = temp.next;
		}
		return str + "]";
	}
}
