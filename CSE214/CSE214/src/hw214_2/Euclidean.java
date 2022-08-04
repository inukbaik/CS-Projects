package hw214_2;

public class Euclidean {
    protected static Ring euclidean(Ring a, Ring b) {
      //TODO: return a if comp.eq(a, b)
      //      return b if comp.eq(a, a.addIdentity())
      //      return a if comp.eq(b, b.addIdentity())
      //      Otherwise, make a recursive call after mod()
    	if(Comp.eq(a, b)) {
    		return a;
    	}
    	else if(Comp.eq(a,  a.addIdentity())) {
    		return b;
    	}
    	else if(Comp.eq(b, b.addIdentity())) {
    		return a;
    	}
    	else {
    		if(Comp.ge(b, a)) {
    			return euclidean(a, ((Modulo) b).mod(a));
    		}
    		else {
    			return euclidean(b, ((Modulo) a).mod(b));
    		}
    	}
    }
    public static Ring GCD(Ring a, Ring b) {
        if(Comp.lt(a, a.addIdentity()))     //if a < 0
            a = a.addInverse();
        if(Comp.lt(b, b.addIdentity()))     //if b < 0
            b = b.addInverse();
        return euclidean(a, b);
    }
    public static Ring LCM(Ring a, Ring b) {
        Ring gcd = GCD(a, b);
        Ring q = ((Modulo)b).quo(gcd);
        return a.mul(q);
    }
}
