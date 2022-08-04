package skipList;

import java.util.Random;

public class SkipList {
    static class Node {
        public int key;
        public Node above, below, next, prev;
        public Node(int k, Node a, Node b, Node n, Node p) {
            key = k; above = a; below = b; next = n; prev = p;
        }
    }
    
    private Node s; //top of the leftmost tower
    private int height, size;
    Random rand;
    
    public SkipList() {
        s      = new Node(Integer.MIN_VALUE, null, null, null, null);
        s.next = new Node(Integer.MAX_VALUE, null, null, null, s);
        height = 0;
        size = 0;
        rand = new Random();
        rand.setSeed(0);
    }
    
    public Node search(int key) {
        Node p = s;
        //TODO: move below until we reach level 0
        //while() {
            //TODO: move right until we reach the containing interval
        //}
        return p;
    }
    
    public Node insert(int key) {
        //search key: p is the lower bound of the interval containing key
        Node p = search(key);
        Node q = null;
        int h = -1;
        while(true) {
            h++;
            if(h >= height) {
                //TODO: raise the leftmost and the rightmost towers
            }

            //TODO: raise the tower q

            //flip the coin
            if(rand.nextInt(2) == 0)
                break;
            
            //TODO: move to the higher level
        }
        size++;
        return q;
    }
    
    public Node remove(int key) {
        //search key
        Node p = search(key);
        if(p.key != key)
            return null;
        
        //remove the tower
        for(Node q = p; q != null; q = q.above) {
            if(q.prev != null)
                q.prev.next = q.next;
            if(q.next != null)
                q.next.prev = q.prev;
        }
        size--;
        return p;
    }
    
    private Node insertAfterAbove(Node before, Node below, int key) {
        Node after = before != null ? before.next : null;
        Node above = below  != null ? below.above : null;
        Node p = new Node(key, above, below, after, before);
        if(before != null)  before.next = p;
        if(after  != null)  after.prev  = p;
        if(below  != null)  below.above = p;
        if(above  != null)  above.below = p;
        return p;
    }
    
    protected static void onFalseThrow(boolean b) {
        if(!b)
            throw new RuntimeException("Error: unexpected");
    }    
    
    public static void main(String[] args) {
        SkipList sl = new SkipList();

        for(int i = 0; i < 10; i++)
            onFalseThrow(sl.insert(i).key == i);
        
        onFalseThrow(sl.height == 5);
        onFalseThrow(sl.size == 10);
        
        for(int i = 0; i < 10; i++)
            onFalseThrow(sl.search(i).key == i);
        
        for(int i = 0; i < 10; i++)
            onFalseThrow(sl.remove(i).key == i);
        
        for(int i = 0; i < 10; i++)
            onFalseThrow(sl.search(i).key == Integer.MIN_VALUE);        
        
        onFalseThrow(sl.height == 5);
        onFalseThrow(sl.size == 0);
        
        System.out.println("Success!");
    }
}
