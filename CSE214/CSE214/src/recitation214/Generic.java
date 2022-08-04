package recitation214;

public class Generic {
    public static interface Ordered {
        public boolean ge(Ordered a);   //greater than or equal to
    }
    
    public static class Int implements Ordered {
        public int n;
        public Int(int n) { this.n = n; }
        public String toString() { return Integer.toString(n); }
        public boolean ge(Ordered a) {
            //TODO: implement this method
            return n >= ((Int)a).n;
        }
    }
    
    public static class Str implements Ordered {
        public String str;
        public Str(String str) { this.str = str; }
        public String toString() { return str; }
        public boolean ge(Ordered a) {
            //TODO: implement this method. Use str.compareTo
            if(str.compareTo(((Str)a).str) >= 0) {
            	return true;
            }else {
            	return false;
            }
        }
    }
    
    public static class Inverter<E> {
        @SuppressWarnings("unused")
        private E[] arr;
        public Inverter(E[] arr) {
            this.arr = arr;
        }
        public void revert() {
            //TODO: implement this method. Use Generic.<E>swap
        	for(int i = 0, j = arr.length-1; i < j; i++, j--)
        		Generic.<E>swap(arr, i, j);
        }
    }
    
    public static class Sorter<E extends Ordered> {
        @SuppressWarnings("unused")
        private E[] arr;
        public Sorter(E[] arr) {
            this.arr = arr;
        }
        public void sort() {
            //TODO: implement insertion sort. Use Generic.<E>swap
        	for(int i = 0; i < arr.length; i ++) {
        		for(int j = i; j > 0; j--) {
        			if(arr[j-1].ge(arr[j]))
        				Generic.<E>swap(arr, j-1, j);
        		}
        	}
        }
    }
    
    public static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }
    
    public static void main(String[] args) {
        Ordered[][] arr = new Ordered[][] {
            new Int[] { new Int(5), new Int(3), new Int(7), new Int(1), new Int(4) },
            new Str[] { new Str("a"), new Str("c"), new Str("d"), new Str("e"), new Str("b") }
        };
        
        for(int i = 0; i < 2; i++) {
            Sorter<Ordered> sorter = new Sorter<Ordered>(arr[i]);
            sorter.sort();
            for(int j = 0; j < arr[i].length; j++)
                System.out.print(" " + arr[i][j]);
            System.out.println("");
        }
        
        for(int i = 0; i < 2; i++) {
            Inverter<Ordered> inverter = new Inverter<Ordered>(arr[i]);
            inverter.revert();
            for(int j = 0; j < arr[i].length; j++)
                System.out.print(" " + arr[i][j]);
            System.out.println("");
        }
    }
}
