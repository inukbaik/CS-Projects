package recitation214;

public class QuickSort {
    protected static void swap(Object[] a, int i, int j) {
        Object t = a[i]; a[i] = a[j]; a[j] = t;
    }
    
    protected static String toString(Object[] a) {
        StringBuilder sb = new StringBuilder();
        for(Object e : a)
            sb.append(e + ", ");
        return sb.toString();
    }
    
    public static <E extends Comparable<E>> void quickSort(E[] a, int l, int r) {
        if(r <= l)
            return;
        
        E pivot = a[r];
        int i = l, j = r - 1;
        while(true) {
            //TODO:
            // while a[i] is less than pivot, i++ (check the bound)
            // while a[j] is larger than or equal to pivot, j-- (check the bound)
            // if i >= j, break
            // otherwise swap a[i] and a[j]
        	while(a[i].compareTo(pivot) < 0 && i != r)
        		i++;
        	while(a[j].compareTo(pivot) >= 0 && j > 0) 
        		j--;
        	if(i >= j)
        		break;
        	else swap(a, i, j);
        }
        //TODO:
        // swap a[i] and a[r]
        // call quick sort for a[l .. i-1]
        // call quick sort for a[i+1 .. r]
        swap(a, i, r);
        quickSort(a, l, i-1);
        quickSort(a, i+1, r);
    }
    public static <E extends Comparable<E>> void quickSort(E[] a) {
        quickSort(a, 0, a.length-1);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {3, 1, 2, 4, 5, 7, 9, 0, 8, 6, 3, 5, 8, 9};
        quickSort(a);
        System.out.println("Quick sort:     " + toString(a));
    }
}
