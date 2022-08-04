package recitation214;

public class DoublyLinkedList<E extends Comparable<E>> {
    private static class Node<E extends Comparable<E>> {
        private E e;
        private Node<E> next, prev;
        public Node(E e, Node<E> p, Node<E> n) { this.e = e; prev = p; next = n; }
        public E getElement() { return e; }
        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }
        @SuppressWarnings("unused")
        public void setPrev(Node<E> p) { prev = p; }
        public void setNext(Node<E> n) { next = n; }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DoublyLinkedList() {
        head = new Node<E>(null, null, null);
        tail = new Node<E>(null, head, null);
        head.setNext(tail);
    }
    public int size()   { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        return isEmpty() ? null : head.getNext().getElement();
    }
    public E last() {
        return isEmpty() ? null : tail.getPrev().getElement();
    }
    public void addFirst(E e) {
        addBetween(e, head, head.getNext());
    }
    public void addLast(E e) {
        addBetween(e, tail.getPrev(), tail);
    }
    public E removeFirst() {
        if(isEmpty()) 
            return null;
        return remove(head.getNext());
    }
    public E removeLast() {
        if(isEmpty()) 
            return null;
        return remove(tail.getPrev());
    }
    
    private void addBetween(E e, Node<E> pred, Node<E>succ) {
        //TODO: 1) implement addBetween. See the lecture slide
    	Node<E> newNode = new Node(e, pred, succ);
    	pred.setNext(newNode);
    	succ.setPrev(newNode);
    	size++;
    }
    private E remove(Node<E> node) {
        //TODO: 1) implement remove. See the lecture slide
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        prev.next = next;
        next.prev = prev;
        E removed = node.e;
        node = null;
        size--;
        return removed;
    }
    
    public E find(E e) {
        //TODO: 2) implement find using compareTo
        while(e != null) {
        	E find;
        	if(head.next.e == e) {
        		find = e;
        		return find;
        	}
        }
        return null;
    }

    private void swap(Node<E> n, Node<E> m) {
        //TODO: 3) implement swap using the methods of Node
        //         don't simply switch the ref to elements
    	Node<E> temp1 = n.prev;
    	Node<E> temp2 = n.next;
    	Node<E> temp3 = m.prev;
    	Node<E> temp4 = m.next;
    	
    	temp1.setNext(m);
    	temp2.setPrev(m);
    	temp3.setNext(n);
    	temp4.setPrev(n);
    }
    
    public void sort() {
        //TODO: 4) implement sort using the methods of Node
    	
    }
    
    
    
    private static void onFalseThrow(boolean b) {
        if(!b)
            throw new RuntimeException("Error: unexpected");            
    }
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.addLast(4);
        list.addLast(2);
        list.addLast(1);
        list.addFirst(3);
        onFalseThrow(list.find(4) == 4); 
        onFalseThrow(list.find(5) == null);
        
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.swap(list.head.next, list.head.next.next);
        onFalseThrow(list.removeFirst() == 3); 
        onFalseThrow(list.removeFirst() == 4); 
        list.swap(list.head.next.next, list.head.next);
        onFalseThrow(list.removeFirst() == 1); 
        onFalseThrow(list.removeFirst() == 2); 
        
        list.sort();
        onFalseThrow(list.removeLast()  == 4); 
        onFalseThrow(list.removeLast()  == 3); 
        onFalseThrow(list.removeFirst() == 1); 
        onFalseThrow(list.removeLast()  == 2); 

        System.out.println("Success!");
    }
}
