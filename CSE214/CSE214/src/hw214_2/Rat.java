package hw214_2;

//Rational number
public class Rat implements Field, Modulo, Ordered {
    private int numtr;
    private int dentr;
	
	public Rat(int numerator, int denumerator) {
    	Int gcd = (Int) Euclidean.GCD(new Int(numerator), new Int(denumerator));
    	numtr = numerator / gcd.getInt();
    	dentr = denumerator / gcd.getInt();
    }
	
	public int getNum() {
		return numtr;
	}
	
	public int getDen() {
		return dentr;
	}
	
	public Ring add(Ring a) {
		int result1 = numtr * ((Rat) a).dentr + dentr * ((Rat) a).numtr;
		int result2 = ((Rat) a).dentr * dentr;
		return new Rat(result1, result2);
	}
	
	public Ring addIdentity() {
		return new Rat(0,1);
	}
	
	public Ring addInverse() {
		return new Rat(-numtr, dentr);
	}
	
	public Ring mul(Ring a) {
		return new Rat(numtr * ((Rat) a).numtr, dentr * ((Rat) a).dentr);
	}
	
	public Ring mulIdentity() {
		return new Rat(1, 1);
	}
	
	public Ring mulInverse() throws ArithmeticException {
		return new Rat(dentr, numtr);
	}
	
	public Ring mod(Ring a) {
		return this.add((this.quo(a)).mul(a).addInverse());
	}
	
	public Ring quo(Ring a) {
		return new Rat((numtr * ((Rat) a).dentr) / (dentr * ((Rat) a).numtr), 1);
	}
	
	public boolean ge(Ordered a) {
		return numtr * ((Rat) a).dentr >= dentr * ((Rat) a).numtr;
	}
}
