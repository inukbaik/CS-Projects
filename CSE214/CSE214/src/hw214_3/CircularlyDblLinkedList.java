package hw214_3;

import java.util.Iterator;

public class CircularlyDblLinkedList<E> implements List<E>, Iterable<E> {
    protected static class Node<E> {
        public E e;
        public Node<E> prev, next;
        public Node() { 
            this.e = null; this.prev = this; this.next = this;
        }
        public Node(E e, Node<E> prev, Node<E> next) {
            this.e = e; this.prev = prev; this.next = next;
        }
    }
    public class NodeIterator<E> implements Iterator<E> {
        private Node<E> head, curr;
        private int nextIndex;
        public NodeIterator(Node<E> head) {
            this.head = head; this.curr = head;
        }
        //TODO: implement Iterator<E>
        
        public boolean hasNext() {
        	return nextIndex<size;
        }
        
        public E next() {
        	Node<E> lastReturned = curr;
        	curr = curr.next;
        	nextIndex++;
        	return lastReturned.e;
        }
        
        public void remove() {
        	if(nextIndex == 0) {
        		throw new IllegalStateException();
        	}
        	CircularlyDblLinkedList.this.remove(nextIndex - 1);
        	nextIndex--;
        }
        
//        public void add() {
//        	
//        }
        
    }
    
    protected Node<E> head;
    protected int size;

    //constructor
    public CircularlyDblLinkedList() {
        head = new Node<E>();
        size = 0;
    }
    
    //TODO: implement interface List - done
    public E get(int i) {
        return findNode(i).e;
    }
    
    public int size() {
    	return size;
    }
    
    public boolean isEmpty() {
    	return size == 0;
    }
    
    public E set(int i, E e) {
    	Node <E> temp = findNode(i);
    	temp.e = e;
    	return temp.e;
    }
    
    public void add(int i, E e) {
    	if(isEmpty()) {
    		head = new Node(e, null, null);
    		head.prev = head;
    		head.next = head;
    	}else {
    		Node <E> temp1 = findNode(i);
    		Node <E> temp2 = temp1.prev;
    		Node <E> newNode = new Node(e, temp2, temp1);
    		temp2.next = newNode;
    		newNode.prev = temp2;
    		newNode.next = temp1;
    		temp1.prev = newNode;
    		if(i == 0) {
    			head = newNode;
    		}
    	}
    	size++;
    }
    
    public E remove(int i) {
    	Node <E> tobeDeleted = findNode(i);
    	Node <E> temp1 = tobeDeleted.prev;
    	Node <E> temp2 = tobeDeleted.next;
    	temp1.next = temp2;
    	temp2.prev = temp1;
    	if(i == 0) {
    		head = tobeDeleted.next;
    	}
    	E deletedData = tobeDeleted.e;
    	size--;
    	return deletedData;
    }

    //TODO: implement interface Iterable
	public Iterator<E> iterator(){
		return new NodeIterator<E>(head);
	}

    //helper methods
    protected Node<E> findNode(int i) {
        if(i < 0 || i > size)
            throw new IndexOutOfBoundsException("invalid index: " + i + " is not in [ 0, " + size + ")");
        Node <E> x = head;
        for(int j = 0; j < i; j++) {
        	x = x.next;
        }
        return x;
        //TODO: find the node at index i and return it 
    }
    private static void onFalseThrow(boolean b) {
        if(!b)
            throw new RuntimeException("Error: unexpected");            
    }
    public static void main(String[] args) {
        CircularlyDblLinkedList<Integer> list = new CircularlyDblLinkedList<Integer>();
        list.add(list.size(), 2);
        list.add(list.size(),3);
        list.add(list.size(),4);
        list.add(0, 1);
        onFalseThrow(list.remove(list.size()-1) == 4); 
        onFalseThrow(list.remove(list.size()-1) == 3); 
        onFalseThrow(list.remove(0) == 1); 
        onFalseThrow(list.remove(list.size()-1) == 2); 
        onFalseThrow(list.isEmpty()); 
        System.out.println("Success!");
    }  
}
