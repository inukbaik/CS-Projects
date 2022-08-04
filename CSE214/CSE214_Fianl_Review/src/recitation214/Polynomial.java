package recitation214;

public class Polynomial {
    private double[] coef;
    
    public Polynomial(double[] coef) {
        //trim the leading zeros
        int n = coef.length;
        while(n-1 >= 0 && coef[n-1] == 0)
            n--;
        
        this.coef = new double[n];
        for(int i = 0; i < n; i++)
            this.coef[i] = coef[i];
    }
    public String toString() {
        String str = "";
        for(int i = coef.length - 1; i > 0; i--)
            str = str + coef[i] + "x^" + i + " + ";
        str = str + coef[0];
        return str;
    }
    public Polynomial add(Polynomial that) {
    	double[] c = new double[Math.max(this.coef.length, that.coef.length)];
    	for(int i = 0; i < this.coef.length; i ++) {
    		c[i] = this.coef[i];
    	}
    	for(int i = 0; i < that.coef.length; i ++) {
    		c[i] += that.coef[i];
    	}
    	return new Polynomial(c);
    }
    public Polynomial mul(Polynomial that) {
        double[] c = new double[this.coef.length + that.coef.length - 1];
        for(int i = 0; i < this.coef.length; i++) {
        	for(int j = 0; j < that.coef.length; j++) {
        		c[i + j] = this.coef[i] * that.coef[j];
        	}
        }
        return new Polynomial(c);
    }
    public Polynomial[] longdiv(Polynomial that) {
        //return value: longdiv(...)[0]: quotient,
        //              longdiv(...)[1]: remainder
    	double[] quo = new double[Math.abs(this.coef.length - that.coef.length)];
    	double[] num = new double[]
    	
        return null; 
    }
    public static void main(String[] args) {
        Polynomial a = new Polynomial(new double[] {-1, 1});
        System.out.println("a: " + a);
        
        Polynomial b = new Polynomial(new double[] { 1, 1});
        System.out.println("b: " + b);
        
        Polynomial c = a.add(b);
        System.out.println("c = (a + b): " + c);
        
        Polynomial d = a.mul(b);
        System.out.println("d = (a * b): " + d);
        
        Polynomial e = d.add(c);
        System.out.println("e = (d + c): " + e);
        
        Polynomial[] f = e.longdiv(a);
        System.out.println("e / a: " + f[0]);
        System.out.println("e % a: " + f[1]);
    }
}
