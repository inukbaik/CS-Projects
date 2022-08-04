package hw214_2;

//Integer modulo m (m is a prime number)
public class IntMod implements Field, Ordered {
    private int n, m;
	
	public IntMod(int n, int m) {
		if (m <= 0)
			throw new IllegalArgumentException("Not a positive divisor");
		n = n % m;
		n = n < 0 ? n + m : n;
		this.n = n;
		this.m = m;
    }
	
	public Ring add(Ring a) {
		int result = (n + ((IntMod) a).n) % m;
		return new IntMod(result, m);
	}
	
	public Ring addIdentity() {
		return addIdentity2(0);
	}
	
	private Ring addIdentity2(int num) {
		if((n + num) % m == n) {
			return new IntMod(num, m);
		}else {
			return addIdentity2(num + 1);
		}
	}
	
	public Ring addInverse() {
		return addInverse2(0);
	}
	
	private Ring addInverse2(int num) {
		if((n + num) % m == 0) {
			return new IntMod(num, m);
		}else {
			return addInverse2(num + 1);
		}
	}
	
	public Ring mul(Ring a) {
		int result = (n * ((IntMod) a).n) % m;
		return new IntMod(result, m);
	}
	
	public Ring mulIdentity() {
		return mulIdentity2(0);
	}
	
	private Ring mulIdentity2(int num) {
		if((n * num) % m == n) {
			return new IntMod(num, m);
		}else {
			return mulIdentity2(num + 1);
		}
	}
	
	public Ring mulInverse() throws ArithmeticException{
		return mulInverse2(0);
	}
	
	private Ring mulInverse2(int num) throws ArithmeticException {
		if((n * num) % m == 1) {
			return new IntMod(num, m);
		}else {
			return mulInverse2(num + 1);
		}
	}
	
	public boolean ge(Ordered a) {
		return n >= ((IntMod) a).n;
	}
}
