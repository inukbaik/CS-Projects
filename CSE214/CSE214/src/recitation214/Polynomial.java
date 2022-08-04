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
    	double[] c = new double[Math.max(this.coef.length,  that.coef.length)];
    	for(int i = 0; i < this.coef.length; i++)
    		c[i] = this.coef[i];
    	for(int i = 0; i < that.coef.length; i++)
    		c[i] += that.coef[i];
    	return new Polynomial(c);
    }
    public Polynomial mul(Polynomial that) {
        double[] d = new double[this.coef.length + that.coef.length - 1];
        for(int i = 0; i < this.coef.length; i++)
        	for(int j = 0; j < that.coef.length; j++)
        		d[i+j] += this.coef[i] * that.coef[j];
    	return new Polynomial(d);
    }
    public Polynomial[] longdiv(Polynomial that) {
        //return value: longdiv(...)[0]: quotient,
        //              longdiv(...)[1]: remainder
        double[] quo = new double[this.coef.length - that.coef.length +1]; //quotient
        double[] num = new double[this.coef.length]; //numberator, remainder
        double[] den = that.coef; //denominator
        int dd = den.length - 1;
        
        //copy this.coef to num
        for(int i = 0; i < this.coef.length; i++)
        	num[i] = this.coef[i];
        
        //the long division algorithm
        for(int qi = quo.length - 1; qi >= 0; qi--) {
        	quo[qi] = num[qi + dd] / den[dd];
        	for(int i = 0; i < dd; i++)
        		num[qi+i] = num[qi+i] - quo[qi] * den[i];
        	num[qi+dd] = 0;
        }
        return new Polynomial[] {new Polynomial(quo), new Polynomial(num)};
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
