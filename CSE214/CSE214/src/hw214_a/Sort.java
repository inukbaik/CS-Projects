package hw214_a;

public class Sort {
    //TODO
    //Submit your course evaluation at
    //https://stonybrook.campuslabs.com/courseeval/
    //
	
    protected static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
    protected static String toString(int[] a) {
    	StringBuilder sb = new StringBuilder();
        for(Integer e : a)
            sb.append(e + ", ");
        return sb.toString();
    }    
    protected static int checkBit(int a, int shift) {
        //return the shift-th bit of a
        return (a & (1 << shift)) != 0 ? 1 : 0; 
    }
    public static void radixSort1(int[] a, int l, int r, int b) {
        //TODO
        //return if l >= r or b < 0
        //repeat
        //  from l find the number whose b-th bit is 1
        //  from r find the number whose b-th bit is 0
        //  swap the two numbers
        //until the indexes of the numbers meet
        //recursively call radixSort1 with b-1 and new l, r
    	int start = l;
    	int end = r;
    	if(l >= r || b < 0)
    		return;
    	while(l != r) {
    		int left = -1;
    		int right = -1;
    		while(l < r) {
    			if(checkBit(a[l], b - 1) >= 1) {
    				left = l;
    				break;
    			}
    			l++;
    		}
    		while(r > l) {
    			if(checkBit(a[r], b - 1) < 1) {
    				right = r;
    				break;
    			}
    			r--;
    		}
    		if(left != -1 && right != -1)
    			swap(a, left, right);
    	}
    	if(l == end) {
    		radixSort1(a, start, end, b-1);
    	}else {
    		radixSort1(a, start, l - 1, b-1);
    		radixSort1(a, l, end, b-1);
    	}
    }
    public static void radixSort1(int[] a) {
        radixSort1(a, 0, a.length-1, 31);
    }
    public static void radixSort2(int[] a) {

    	int[] b = new int[a.length];
        //TODO
        //foreach i in [0, 31]
        //  let i0 be 0, and
        //  let i1 be the # of a[..] with its i-th bit = 0
        //  copy a[j] to b[i0++] if a[j]'s i-th bit is 0
        //  copy a[j] to b[i1++] otherwise
        //  copy b to a
        for(int i = 0; i <= 31; i++) {
        	int i0 = 0;
        	int i1 = 0;
        	for(int j = 0; j < a.length; j++) {
        		if(checkBit(a[j], i) < 1)
        			i1++;
        	}
        	for(int j = 0; j < a.length; j++) {
        		if(checkBit(a[j], i) < 1)
        			b[i0++] = a[j];
        		else
        			b[i1++] = a[j];
        	}
        	for(Integer j : b)
        		a[j] = b[j];
        	b = new int[a.length];
        }
    }
    
    public static void main(String[] args) {
        int[] a = new int[] {3, 1, 2, 4, 5, 7, 9, 0, 8, 6};
        radixSort1(a);
        System.out.println("Radix sort 1: " + toString(a));

        a = new int[] {3, 1, 2, 4, 5, 7, 9, 0, 8, 6};
        radixSort2(a);
        System.out.println("Radix sort 2: " + toString(a));
    }
}
