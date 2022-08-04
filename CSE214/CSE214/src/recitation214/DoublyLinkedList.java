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
    	Node<E> newest = new Node<E>(e, pred, succ);
    	pred.setNext(newest);
    	succ.setPrev(newest);
    	size++;
    }
    private E remove(Node<E> node) {
        Node<E> pred = node.getPrev();
        Node<E> succ = node.getNext();
        pred.setNext(succ);
        succ.setPrev(pred);
        size--;
        return node.getElement();
    }
    
    public E find(E e) {
        for(Node<E> n = head.getNext(); n != tail; n = n.getNext())
        	if(e.compareTo(n.getElement()) == 0)
        		return n.getElement();
        return null;
    }

    private void swap(Node<E> n, Node<E> m) {
        //TODO: 3) implement swap using the methods of Node
        //         don't simply switch the ref to elements
    	Node<E> a = m.getNext();
    	if(a == n) {
    		swap(m, n);
    	}
    	
    	
        m.getNext().setPrev(m.getPrev());
        m.getPrev().setNext(m.getNext());
    
        n.getNext().setPrev(m);
        n.getPrev().setNext(m);
        m.setPrev(n.getPrev());
        m.setNext(n.getNext());
        
        n.setNext(a);
        n.setPrev(a.getPrev());
        a.getPrev().setNext(n);
        a.setPrev(n);
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
