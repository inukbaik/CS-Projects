package hw214_1;

//Rational number
// Rat(10, 15) is 10/15 and is equivalent to Rat(2, 3)
//
public class Rat implements Field, Modulo, Ordered {
    private int num;
    private int denum;
	
	public Rat(int numerator, int denumerator) {
        //TODO: make numerator and denominator prime to
        //each other using Euclidean.gcd        
		Int gcd = (Int) Euclidean.GCD(new Int(numerator), new Int(denumerator));
		num = numerator / gcd.getInt();
		denum = denumerator / gcd.getInt();
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return denum;
	}
    
    //Modulo
    public Ring mod(Ring a) {
        return this.add((this.quo(a)).mul(a).addInverse());
    }
    
    //Ordered
    public boolean ge(Ordered a) {
        return num * ((Rat) a).denum >= denum * ((Rat) a).num;
    }

	@Override
	public Ring add(Ring a) {
		int value1 = num * ((Rat) a).denum + denum * ((Rat) a).num;
		int value2 = ((Rat) a).denum * denum;
		return new Rat(value1, value2);
	}

	@Override
	public Ring addIdentity() {
		return new Rat(0, 1);
	}

	@Override
	public Ring addInverse() {
		return new Rat(-num, denum);
	}

	@Override
	public Ring mul(Ring a) {
		return new Rat(num * ((Rat) a).num, denum * ((Rat) a).denum);
	}

	@Override
	public Ring quo(Ring a) {
		return new Rat((num * ((Rat) a).denum) / (denum * ((Rat) a).num), 1);
	}

	@Override
	public Ring mulIdentity() {
		return new Rat(1, 1);
	}

	@Override
	public Ring mulInverse() throws ArithmeticException {
		return new Rat(denum, num);
	}
}
